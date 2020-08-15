package org.xpande.cfe.process;

import com.sun.mail.imap.IMAPStore;
import org.compiere.model.*;
import org.compiere.util.DB;
import org.compiere.util.TimeUtil;
import org.xpande.cfe.model.*;
import uy.gub.dgi.cfe.*;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.process.SvrProcess;

import java.io.File;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.MimeBodyPart;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.sun.mail.pop3.POP3Store;


/**
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 8/8/20.
 */
public class LeerBandejaCFE extends SvrProcess {

    MZCFEConfig cfeConfig = null;

    @Override
    protected void prepare() {

    }

    @Override
    protected String doIt() throws Exception {

        try{
            // Instancio configuracion de CFE
            this.cfeConfig = MZCFEConfig.getDefault(getCtx(), null);

            // Leer emails, obtener archivos xmls y procesarlos
            this.getEmails();
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return "OK";
    }


    /***
     * Lee bandeja de mails y procesa los archivos XMLs correspondientes a CFEs.
     * Luego mueve los emails a una carpeta de backup en el servidor de correo.
     * Xpande. Created by Gabriel Vila on 8/15/20.
     * @return
     */
    private String getEmails(){

        String resultado = null;

        try{
            MEMailConfig meMailConfig = (MEMailConfig) this.cfeConfig.getAD_EMailConfig();

            Properties properties = new Properties();
            //properties.put("mail.pop3.host", meMailConfig.getSMTPHost());
            //Session emailSession = Session.getDefaultInstance(properties);

            properties.put("mail.store.protocol", "imaps");
            Session emailSession = Session.getDefaultInstance(properties, null);

            //2) create the POP3 store object and connect with the pop server
            //POP3Store emailStore = (POP3Store) emailSession.getStore("pop3");
            //emailStore.connect(this.cfeConfig.getEMail(), this.cfeConfig.getEMailUserPW());

            IMAPStore emailStore = (IMAPStore) emailSession.getStore("imaps");
            emailStore.connect(meMailConfig.getSMTPHost(), this.cfeConfig.getEMail(), this.cfeConfig.getEMailUserPW());

            //3) create the folder object and open it
            Folder emailFolder = emailStore.getFolder("INBOX");
            emailFolder.open(Folder.READ_WRITE);

            String backupFolderName = "Backup";
            Folder backupFolder = emailStore.getFolder(backupFolderName);
            if (backupFolder == null){
                return "No se encontró la carpeta de respaldo de correo : " + backupFolderName;
            }
            backupFolder.open(Folder.READ_WRITE);

            //4) retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            for (int i = 0; i < messages.length; i++) {

                Message message = messages[i];

                String contentType = message.getContentType();

                // store attachment file name, separated by comma
                String attachFiles = "";

                if (contentType.contains("multipart")) {
                    // content may contain attachments
                    Multipart multiPart = (Multipart) message.getContent();
                    int numberOfParts = multiPart.getCount();
                    for (int partCount = 0; partCount < numberOfParts; partCount++) {
                        MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(partCount);
                        if (Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition())) {
                            // this part is attachment
                            String fileName = part.getFileName();
                            attachFiles += fileName + ", ";
                            part.saveFile("/tmp/" + fileName);

                            if (fileName.contains(".xml")){
                                File fileCFEXml = new File("/tmp/" + fileName);
                                JAXBContext jaxbContext = JAXBContext.newInstance(EnvioCFEEntreEmpresas.class);
                                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

                                EnvioCFEEntreEmpresas cfeEntreEmpresas = null;

                                try{
                                    cfeEntreEmpresas = (EnvioCFEEntreEmpresas) jaxbUnmarshaller.unmarshal(fileCFEXml);
                                }
                                catch (Exception e){
                                    return "No se pudo procesar el archivo : " + fileName + ", " +
                                            "Tema: " + message.getSubject() + ", " +
                                            "Enviado por : " + message.getFrom()[0];
                                }

                                // Se genera el registro en Bandeja CFE del sistema.
                                resultado = this.generateBandejaCFE(cfeEntreEmpresas, message.getSubject(), message.getFrom()[0].toString(), fileName);
                                if (resultado != null){
                                    return resultado;
                                }
                            }

                        }
                    }
                    if (attachFiles.length() > 1) {
                        attachFiles = attachFiles.substring(0, attachFiles.length() - 2);
                    }
                }

                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent().toString());
                System.out.println("\t Attachments: " + attachFiles);
            }


            // Copio mensajes a folder de backup
            emailFolder.copyMessages(messages, backupFolder);

            // Elimino mensajes de Inbox para no volve a procesarlos
            for (int i = 0; i < messages.length; i++) {
                Message message = messages[i];
                message.setFlag(Flags.Flag.DELETED, true);
            }

            //5) close the store and folder objects
            if (emailFolder.isOpen()){
                emailFolder.close(true);
            }

            if (backupFolder.isOpen()){
                backupFolder.close(true);
            }

            emailStore.close();
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return null;
    }

    /***
     * Genera modelo de Bandeja CFE con información del CFE recibido.
     * Xpande. Created by Gabriel Vila on 8/13/20.
     * @param address
     * @param cfeEntreEmpresas
     * @param subject
     * @param fileName
     * @return
     */
    private String generateBandejaCFE(EnvioCFEEntreEmpresas cfeEntreEmpresas, String subject, String emailFrom, String fileName) {

        String message = null;

        try{

            EnvioCFEEntreEmpresas.Caratula caratula = cfeEntreEmpresas.getCaratula();
            String rutReceptor = caratula.getRutReceptor();


            // Seteo cabezal de bandeja cfe
            List<CFEEmpresasType> empresasTypeList = cfeEntreEmpresas.getCFEAdenda();
            for (CFEEmpresasType empresasType: empresasTypeList){
                CFEDefType cfeDefType = empresasType.getCFE();

                String adenda = null;
                if (empresasType.getAdenda() != null){
                    adenda = empresasType.getAdenda().toString();
                }

                if (cfeDefType.getEFact() != null){
                    message = this.generateBandejaCFE_EFact(cfeDefType.getEFact(), rutReceptor, subject, emailFrom, fileName, adenda);
                }
                else if (cfeDefType.getETck() != null){
                    message = this.generateBandejaCFE_ETck(cfeDefType.getETck(), rutReceptor, subject, emailFrom, fileName, adenda);
                }
                else if (cfeDefType.getEResg() != null){
                    message = this.generateBandejaCFE_EResg(cfeDefType.getEResg(), rutReceptor, subject, emailFrom, fileName, adenda);
                }

                if (message != null){
                    return message;
                }
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return null;
    }

    /***
     * Genera nuevo modelo de Bandeja CFE para un documento CFE del tipo : EFact.
     * Xpande. Created by Gabriel Vila on 8/14/20.
     * @param eFact
     * @param receptor
     * @param rutReceptor
     * @param subject
     * @param emailFrom
     * @param fileName
     * @return
     */
    private String generateBandejaCFE_EFact(CFEDefType.EFact eFact, String rutReceptor,
                                            String subject, String emailFrom, String fileName, String adenda) {

        try{
            Timestamp today = TimeUtil.trunc(new Timestamp(System.currentTimeMillis()), TimeUtil.TRUNC_DAY);

            CFEDefType.EFact.Encabezado encabezado =  eFact.getEncabezado();
            Emisor emisor = encabezado.getEmisor();
            IdDocFact idDocFact = encabezado.getIdDoc();
            Totales totales = encabezado.getTotales();
            CFEDefType.EFact.Detalle detalle = eFact.getDetalle();
            CAEDataType caeDataType = eFact.getCAEData();

            MZBandejaCFE bandejaCFE = new MZBandejaCFE(getCtx(), 0, get_TrxName());
            bandejaCFE.set_ValueOfColumn("AD_Client_ID", this.cfeConfig.getAD_Client_ID());
            bandejaCFE.setSubject(subject);
            bandejaCFE.setEMail(emailFrom);
            bandejaCFE.setFileName(fileName);
            bandejaCFE.setRutReceptor(rutReceptor);
            bandejaCFE.setTipoCFE(String.valueOf(idDocFact.getTipoCFE()));
            bandejaCFE.setSerieCFE(idDocFact.getSerie());
            bandejaCFE.setNumeroCFE(String.valueOf(idDocFact.getNro()));
            bandejaCFE.setDateDoc(today);
            bandejaCFE.setDateTrx(new Timestamp(idDocFact.getFchEmis().toGregorianCalendar().getTimeInMillis()));
            bandejaCFE.setDateInvoiced(TimeUtil.trunc(bandejaCFE.getDateTrx(), TimeUtil.TRUNC_DAY));

            if (idDocFact.getFchVenc() != null){
                bandejaCFE.setDueDate(new Timestamp(idDocFact.getFchVenc().toGregorianCalendar().getTimeInMillis()));
            }
            else {
                bandejaCFE.setDueDate(bandejaCFE.getDueDate());
            }

            bandejaCFE.setFormaPagoCFE(String.valueOf(idDocFact.getFmaPago()));
            bandejaCFE.setRUCEmisor(emisor.getRUCEmisor());
            bandejaCFE.setName(emisor.getRznSoc().trim().toUpperCase());
            bandejaCFE.setCodSucursal(String.valueOf(emisor.getCdgDGISucur()));
            bandejaCFE.setTpoMonedaCFE(totales.getTpoMoneda().value());
            bandejaCFE.setTpoCambioCFE(totales.getTpoCambio());
            bandejaCFE.setMntNoGrv(totales.getMntNoGrv());
            bandejaCFE.setMntExpoyAsim(totales.getMntExpoyAsim());
            bandejaCFE.setMntImpuestoPerc(totales.getMntImpuestoPerc());
            bandejaCFE.setMntIVaenSusp(totales.getMntIVaenSusp());
            bandejaCFE.setMntNetoIvaTasaMin(totales.getMntNetoIvaTasaMin());
            bandejaCFE.setMntNetoIVATasaBasica(totales.getMntNetoIVATasaBasica());
            bandejaCFE.setMntNetoIVAOtra(totales.getMntNetoIVAOtra());
            bandejaCFE.setIVATasaMin(totales.getIVATasaMin());
            bandejaCFE.setIVATasaBasica(totales.getIVATasaBasica());
            bandejaCFE.setMntIVATasaMin(totales.getMntIVATasaMin());
            bandejaCFE.setMntIVATasaBasica(totales.getMntIVATasaBasica());
            bandejaCFE.setMntIVAOtra(totales.getMntIVAOtra());
            bandejaCFE.setMntTotal(totales.getMntTotal());
            bandejaCFE.setMntTotRetenido(totales.getMntTotRetenido());
            bandejaCFE.setMntTotCredFisc(totales.getMntTotCredFisc());
            bandejaCFE.setMontoNF(totales.getMontoNF());
            bandejaCFE.setMntPagar(totales.getMntPagar());

            if (emisor.getNomComercial() != null){
                bandejaCFE.setName2(emisor.getNomComercial().trim().toUpperCase());
            }
            if (emisor.getEmiSucursal() != null){
                bandejaCFE.setNomSucursal(emisor.getEmiSucursal().trim().toUpperCase());
            }
            if (emisor.getDomFiscal() != null){
                bandejaCFE.setAddress1(emisor.getDomFiscal().trim().toUpperCase());
            }
            if (emisor.getCiudad() != null){
                bandejaCFE.setCity(emisor.getCiudad().trim().toUpperCase());
            }
            if (emisor.getDepartamento() != null){
                bandejaCFE.setRegionName(emisor.getDepartamento().trim().toUpperCase());
            }
            if (adenda != null){
                bandejaCFE.setAdendaCFE(adenda.trim().toUpperCase());
            }

            // Seteo moneda
            if (bandejaCFE.getTpoMonedaCFE() != null){
                MCurrency currency = MCurrency.get(getCtx(), bandejaCFE.getTpoMonedaCFE().trim().toUpperCase());
                if ((currency != null) && (currency.get_ID() > 0)){
                    bandejaCFE.setC_Currency_ID(currency.get_ID());
                }
            }

            // Seteo organizacion
            String sql = " select ad_org_id from ad_orginfo where taxid ='" + bandejaCFE.getRutReceptor() + "' ";
            int adOrgID = DB.getSQLValueEx(null, sql);
            if (adOrgID <= 0){
                return "No se pudo obtener Organización con Nro.Identificación : " + bandejaCFE.getRutReceptor();
            }
            bandejaCFE.setAD_Org_ID(adOrgID);
            bandejaCFE.setAD_OrgTrx_ID(adOrgID);

            // Seteo documento
            MZCFEConfigDocDGI configDocDGI = MZCFEConfigDocDGI.getByCodigoDGI(getCtx(), bandejaCFE.getTipoCFE(), null);
            if ((configDocDGI != null) && (configDocDGI.get_ID() > 0)){
                MZCFEConfigDocSend configDocSend = MZCFEConfigDocSend.getByDgiOrg(getCtx(), configDocDGI.get_ID(), bandejaCFE.getAD_OrgTrx_ID(), null);
                if ((configDocSend != null) && (configDocSend.get_ID() > 0)){
                    bandejaCFE.setC_DocTypeTarget_ID(configDocSend.getC_DocType_ID());
                }
            }

            // Seteo socio de negocio y localización
            sql = " select c_bpartner_id from c_bpartner where taxid ='" + bandejaCFE.getRUCEmisor() + "'";
            int cBPartnerID = DB.getSQLValueEx(null, sql);
            if (cBPartnerID > 0){
                bandejaCFE.setC_BPartner_ID(cBPartnerID);
                MBPartnerLocation[] partnerLocations = MBPartnerLocation.getForBPartner(getCtx(), cBPartnerID, null);
                if (partnerLocations.length > 0){
                    bandejaCFE.setC_BPartner_Location_ID(partnerLocations[0].get_ID());
                }
            }

            bandejaCFE.saveEx();

            for (Totales.RetencPercep retencPercep: totales.getRetencPercep()){
                MZRetencPercepCFE retencPercepCFE = new MZRetencPercepCFE(getCtx(), 0, get_TrxName());
                retencPercepCFE.set_ValueOfColumn("AD_Client_ID", bandejaCFE.getAD_Client_ID());
                retencPercepCFE.setAD_Org_ID(bandejaCFE.getAD_Org_ID());
                retencPercepCFE.setZ_BandejaCFE_ID(bandejaCFE.get_ID());
                retencPercepCFE.setCodRetCFE(retencPercep.getCodRet());
                retencPercepCFE.setValRetPercCFE(retencPercep.getValRetPerc());
                retencPercepCFE.saveEx();
            }

            // Lineas
            List<ItemDetFact> detFactList = detalle.getItem();
            for (ItemDetFact detFact: detFactList){
                MZBandejaCFELin bandejaCFELin = new MZBandejaCFELin(getCtx(), 0, get_TrxName());
                bandejaCFELin.set_ValueOfColumn("AD_Client_ID", bandejaCFE.getAD_Client_ID());
                bandejaCFELin.setAD_Org_ID(bandejaCFE.getAD_Org_ID());
                bandejaCFELin.setZ_BandejaCFE_ID(bandejaCFE.get_ID());
                bandejaCFELin.setNroLinDetCFE(detFact.getNroLinDet());
                if (detFact.getCodItem() != null){
                    if (detFact.getCodItem().size() > 0){
                        bandejaCFELin.setCodItemCFE(detFact.getCodItem().get(0).getCod());
                    }
                }
                bandejaCFELin.setIndFactCFE(String.valueOf(detFact.getIndFact()));
                bandejaCFELin.setIndAgenteRespCFE(detFact.getIndAgenteResp());
                bandejaCFELin.setQtyInvoiced(detFact.getCantidad());
                bandejaCFELin.setPriceEntered(detFact.getPrecioUnitario());
                bandejaCFELin.setDescuentoPct(detFact.getDescuentoPct());
                bandejaCFELin.setDescuentoMonto(detFact.getDescuentoMonto());
                bandejaCFELin.setRecargoPct(detFact.getRecargoPct());
                bandejaCFELin.setRecargoMnt(detFact.getRecargoMnt());
                bandejaCFELin.setMontoItem(detFact.getMontoItem());

                if (detFact.getNomItem() != null){
                    bandejaCFELin.setNomItemCFE(detFact.getNomItem().trim().toUpperCase());
                }
                if (detFact.getDscItem() != null){
                    bandejaCFELin.setDscItemCFE(detFact.getDscItem().trim().toUpperCase());
                }
                if (detFact.getUniMed() != null){
                    bandejaCFELin.setUniMedCFE(detFact.getUniMed().trim().toUpperCase());
                }

                bandejaCFELin.saveEx();

                for (RetPerc retPercItem: detFact.getRetencPercep()){
                    MZRetPercItemCFE retPercItemCFE = new MZRetPercItemCFE(getCtx(), 0, get_TrxName());
                    retPercItemCFE.set_ValueOfColumn("AD_Client_ID", bandejaCFE.getAD_Client_ID());
                    retPercItemCFE.setAD_Org_ID(bandejaCFE.getAD_Org_ID());
                    retPercItemCFE.setZ_BandejaCFELin_ID(bandejaCFELin.get_ID());
                    retPercItemCFE.setCodRetCFE(retPercItem.getCodRet());
                    retPercItemCFE.setRate(retPercItem.getTasa());
                    retPercItemCFE.setMntSujetoaRet(retPercItem.getMntSujetoaRet());
                    retPercItemCFE.setValRetPercCFE(retPercItem.getValRetPerc());
                    retPercItemCFE.saveEx();
                }
            }

            if (caeDataType != null){
                MZBandejaCFECAE cfecae = new MZBandejaCFECAE(getCtx(), 0, get_TrxName());
                cfecae.set_ValueOfColumn("AD_Client_ID", bandejaCFE.getAD_Client_ID());
                cfecae.setAD_Org_ID(bandejaCFE.getAD_Org_ID());
                cfecae.setZ_BandejaCFE_ID(bandejaCFE.get_ID());
                cfecae.setCAE_ID(String.valueOf(caeDataType.getCAEID()));
                cfecae.setDueDate(new Timestamp(caeDataType.getFecVenc().toGregorianCalendar().getTimeInMillis()));
                cfecae.setDNroCFE(caeDataType.getDNro().intValueExact());
                cfecae.setHNroCFE(caeDataType.getHNro().intValueExact());
                cfecae.saveEx();
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return null;
    }

    /***
     * Genera nuevo modelo de Bandeja CFE para un documento CFE del tipo : ETck.
     * Xpande. Created by Gabriel Vila on 8/14/20.
     * @param eTck
     * @param rutReceptor
     * @param subject
     * @param emailFrom
     * @param fileName
     * @param adenda
     * @return
     */
    private String generateBandejaCFE_ETck(CFEDefType.ETck eTck, String rutReceptor,
                                           String subject, String emailFrom, String fileName, String adenda) {

        try{
            Timestamp today = TimeUtil.trunc(new Timestamp(System.currentTimeMillis()), TimeUtil.TRUNC_DAY);

            CFEDefType.ETck.Encabezado encabezado =  eTck.getEncabezado();
            Emisor emisor = encabezado.getEmisor();
            IdDocTck idDocTck = encabezado.getIdDoc();
            Totales totales = encabezado.getTotales();
            CFEDefType.ETck.Detalle detalle = eTck.getDetalle();
            CAEDataType caeDataType = eTck.getCAEData();

            MZBandejaCFE bandejaCFE = new MZBandejaCFE(getCtx(), 0, get_TrxName());
            bandejaCFE.set_ValueOfColumn("AD_Client_ID", this.cfeConfig.getAD_Client_ID());
            bandejaCFE.setSubject(subject);
            bandejaCFE.setEMail(emailFrom);
            bandejaCFE.setFileName(fileName);
            bandejaCFE.setRutReceptor(rutReceptor);
            bandejaCFE.setTipoCFE(String.valueOf(idDocTck.getTipoCFE()));
            bandejaCFE.setSerieCFE(idDocTck.getSerie());
            bandejaCFE.setNumeroCFE(String.valueOf(idDocTck.getNro()));
            bandejaCFE.setDateDoc(today);
            bandejaCFE.setDateTrx(new Timestamp(idDocTck.getFchEmis().toGregorianCalendar().getTimeInMillis()));
            bandejaCFE.setDateInvoiced(TimeUtil.trunc(bandejaCFE.getDateTrx(), TimeUtil.TRUNC_DAY));

            if (idDocTck.getFchVenc() != null){
                bandejaCFE.setDueDate(new Timestamp(idDocTck.getFchVenc().toGregorianCalendar().getTimeInMillis()));
            }
            else {
                bandejaCFE.setDueDate(bandejaCFE.getDueDate());
            }

            bandejaCFE.setFormaPagoCFE(String.valueOf(idDocTck.getFmaPago()));
            bandejaCFE.setRUCEmisor(emisor.getRUCEmisor());
            bandejaCFE.setName(emisor.getRznSoc().trim().toUpperCase());
            bandejaCFE.setCodSucursal(String.valueOf(emisor.getCdgDGISucur()));
            bandejaCFE.setTpoMonedaCFE(totales.getTpoMoneda().value());
            bandejaCFE.setTpoCambioCFE(totales.getTpoCambio());
            bandejaCFE.setMntNoGrv(totales.getMntNoGrv());
            bandejaCFE.setMntExpoyAsim(totales.getMntExpoyAsim());
            bandejaCFE.setMntImpuestoPerc(totales.getMntImpuestoPerc());
            bandejaCFE.setMntIVaenSusp(totales.getMntIVaenSusp());
            bandejaCFE.setMntNetoIvaTasaMin(totales.getMntNetoIvaTasaMin());
            bandejaCFE.setMntNetoIVATasaBasica(totales.getMntNetoIVATasaBasica());
            bandejaCFE.setMntNetoIVAOtra(totales.getMntNetoIVAOtra());
            bandejaCFE.setIVATasaMin(totales.getIVATasaMin());
            bandejaCFE.setIVATasaBasica(totales.getIVATasaBasica());
            bandejaCFE.setMntIVATasaMin(totales.getMntIVATasaMin());
            bandejaCFE.setMntIVATasaBasica(totales.getMntIVATasaBasica());
            bandejaCFE.setMntIVAOtra(totales.getMntIVAOtra());
            bandejaCFE.setMntTotal(totales.getMntTotal());
            bandejaCFE.setMntTotRetenido(totales.getMntTotRetenido());
            bandejaCFE.setMntTotCredFisc(totales.getMntTotCredFisc());
            bandejaCFE.setMontoNF(totales.getMontoNF());
            bandejaCFE.setMntPagar(totales.getMntPagar());

            if (emisor.getNomComercial() != null){
                bandejaCFE.setName2(emisor.getNomComercial().trim().toUpperCase());
            }
            if (emisor.getEmiSucursal() != null){
                bandejaCFE.setNomSucursal(emisor.getEmiSucursal().trim().toUpperCase());
            }
            if (emisor.getDomFiscal() != null){
                bandejaCFE.setAddress1(emisor.getDomFiscal().trim().toUpperCase());
            }
            if (emisor.getCiudad() != null){
                bandejaCFE.setCity(emisor.getCiudad().trim().toUpperCase());
            }
            if (emisor.getDepartamento() != null){
                bandejaCFE.setRegionName(emisor.getDepartamento().trim().toUpperCase());
            }
            if (adenda != null){
                bandejaCFE.setAdendaCFE(adenda.trim().toUpperCase());
            }

            // Seteo moneda
            if (bandejaCFE.getTpoMonedaCFE() != null){
                MCurrency currency = MCurrency.get(getCtx(), bandejaCFE.getTpoMonedaCFE().trim().toUpperCase());
                if ((currency != null) && (currency.get_ID() > 0)){
                    bandejaCFE.setC_Currency_ID(currency.get_ID());
                }
            }

            // Seteo organizacion
            String sql = " select ad_org_id from ad_orginfo where taxid ='" + bandejaCFE.getRutReceptor() + "' ";
            int adOrgID = DB.getSQLValueEx(null, sql);
            if (adOrgID <= 0){
                return "No se pudo obtener Organización con Nro.Identificación : " + bandejaCFE.getRutReceptor();
            }
            bandejaCFE.setAD_Org_ID(adOrgID);
            bandejaCFE.setAD_OrgTrx_ID(adOrgID);

            // Seteo documento
            MZCFEConfigDocDGI configDocDGI = MZCFEConfigDocDGI.getByCodigoDGI(getCtx(), bandejaCFE.getTipoCFE(), null);
            if ((configDocDGI != null) && (configDocDGI.get_ID() > 0)){
                MZCFEConfigDocSend configDocSend = MZCFEConfigDocSend.getByDgiOrg(getCtx(), configDocDGI.get_ID(), bandejaCFE.getAD_OrgTrx_ID(), null);
                if ((configDocSend != null) && (configDocSend.get_ID() > 0)){
                    bandejaCFE.setC_DocTypeTarget_ID(configDocSend.getC_DocType_ID());
                }
            }

            // Seteo socio de negocio y localización
            sql = " select c_bpartner_id from c_bpartner where taxid ='" + bandejaCFE.getRUCEmisor() + "'";
            int cBPartnerID = DB.getSQLValueEx(null, sql);
            if (cBPartnerID > 0){
                bandejaCFE.setC_BPartner_ID(cBPartnerID);
                MBPartnerLocation[] partnerLocations = MBPartnerLocation.getForBPartner(getCtx(), cBPartnerID, null);
                if (partnerLocations.length > 0){
                    bandejaCFE.setC_BPartner_Location_ID(partnerLocations[0].get_ID());
                }
            }

            bandejaCFE.saveEx();

            for (Totales.RetencPercep retencPercep: totales.getRetencPercep()){
                MZRetencPercepCFE retencPercepCFE = new MZRetencPercepCFE(getCtx(), 0, get_TrxName());
                retencPercepCFE.set_ValueOfColumn("AD_Client_ID", bandejaCFE.getAD_Client_ID());
                retencPercepCFE.setAD_Org_ID(bandejaCFE.getAD_Org_ID());
                retencPercepCFE.setZ_BandejaCFE_ID(bandejaCFE.get_ID());
                retencPercepCFE.setCodRetCFE(retencPercep.getCodRet());
                retencPercepCFE.setValRetPercCFE(retencPercep.getValRetPerc());
                retencPercepCFE.saveEx();
            }

            // Lineas
            List<ItemDetFact> detFactList = detalle.getItem();
            for (ItemDetFact detFact: detFactList){
                MZBandejaCFELin bandejaCFELin = new MZBandejaCFELin(getCtx(), 0, get_TrxName());
                bandejaCFELin.set_ValueOfColumn("AD_Client_ID", bandejaCFE.getAD_Client_ID());
                bandejaCFELin.setAD_Org_ID(bandejaCFE.getAD_Org_ID());
                bandejaCFELin.setZ_BandejaCFE_ID(bandejaCFE.get_ID());
                bandejaCFELin.setNroLinDetCFE(detFact.getNroLinDet());
                if (detFact.getCodItem() != null){
                    if (detFact.getCodItem().size() > 0){
                        bandejaCFELin.setCodItemCFE(detFact.getCodItem().get(0).getCod());
                    }
                }
                bandejaCFELin.setIndFactCFE(String.valueOf(detFact.getIndFact()));
                bandejaCFELin.setIndAgenteRespCFE(detFact.getIndAgenteResp());
                bandejaCFELin.setQtyInvoiced(detFact.getCantidad());
                bandejaCFELin.setPriceEntered(detFact.getPrecioUnitario());
                bandejaCFELin.setDescuentoPct(detFact.getDescuentoPct());
                bandejaCFELin.setDescuentoMonto(detFact.getDescuentoMonto());
                bandejaCFELin.setRecargoPct(detFact.getRecargoPct());
                bandejaCFELin.setRecargoMnt(detFact.getRecargoMnt());
                bandejaCFELin.setMontoItem(detFact.getMontoItem());

                if (detFact.getNomItem() != null){
                    bandejaCFELin.setNomItemCFE(detFact.getNomItem().trim().toUpperCase());
                }
                if (detFact.getDscItem() != null){
                    bandejaCFELin.setDscItemCFE(detFact.getDscItem().trim().toUpperCase());
                }
                if (detFact.getUniMed() != null){
                    bandejaCFELin.setUniMedCFE(detFact.getUniMed().trim().toUpperCase());
                }

                bandejaCFELin.saveEx();

                for (RetPerc retPercItem: detFact.getRetencPercep()){
                    MZRetPercItemCFE retPercItemCFE = new MZRetPercItemCFE(getCtx(), 0, get_TrxName());
                    retPercItemCFE.set_ValueOfColumn("AD_Client_ID", bandejaCFE.getAD_Client_ID());
                    retPercItemCFE.setAD_Org_ID(bandejaCFE.getAD_Org_ID());
                    retPercItemCFE.setZ_BandejaCFELin_ID(bandejaCFELin.get_ID());
                    retPercItemCFE.setCodRetCFE(retPercItem.getCodRet());
                    retPercItemCFE.setRate(retPercItem.getTasa());
                    retPercItemCFE.setMntSujetoaRet(retPercItem.getMntSujetoaRet());
                    retPercItemCFE.setValRetPercCFE(retPercItem.getValRetPerc());
                    retPercItemCFE.saveEx();
                }
            }

            if (caeDataType != null){
                MZBandejaCFECAE cfecae = new MZBandejaCFECAE(getCtx(), 0, get_TrxName());
                cfecae.set_ValueOfColumn("AD_Client_ID", bandejaCFE.getAD_Client_ID());
                cfecae.setAD_Org_ID(bandejaCFE.getAD_Org_ID());
                cfecae.setZ_BandejaCFE_ID(bandejaCFE.get_ID());
                cfecae.setCAE_ID(String.valueOf(caeDataType.getCAEID()));
                cfecae.setDueDate(new Timestamp(caeDataType.getFecVenc().toGregorianCalendar().getTimeInMillis()));
                cfecae.setDNroCFE(caeDataType.getDNro().intValueExact());
                cfecae.setHNroCFE(caeDataType.getHNro().intValueExact());
                cfecae.saveEx();
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return null;
    }

    /***
     * Genera nuevo modelo de Bandeja CFE para un documento CFE del tipo : EResg.
     * Xpande. Created by Gabriel Vila on 8/14/20.
     * @param eResg
     * @param rutReceptor
     * @param subject
     * @param emailFrom
     * @param fileName
     * @param adenda
     * @return
     */
    private String generateBandejaCFE_EResg(CFEDefType.EResg eResg, String receptor, String rutReceptor, String subject, String emailFrom, String fileName) {

        try{

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return null;
    }

}
