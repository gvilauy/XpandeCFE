package org.xpande.cfe.process;

import uy.gub.dgi.cfe.CFEEmpresasType;
import uy.gub.dgi.cfe.EnvioCFEEntreEmpresas;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MEMailConfig;
import org.compiere.process.SvrProcess;
import org.xpande.cfe.model.MZCFEConfig;

import java.io.File;
import java.io.IOException;
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

    private void getEmails(){

        try{
            MEMailConfig meMailConfig = (MEMailConfig) this.cfeConfig.getAD_EMailConfig();

            Properties properties = new Properties();
            properties.put("mail.pop3.host", meMailConfig.getSMTPHost());
            Session emailSession = Session.getDefaultInstance(properties);

            //2) create the POP3 store object and connect with the pop server
            POP3Store emailStore = (POP3Store) emailSession.getStore("pop3");
            emailStore.connect(this.cfeConfig.getEMail(), this.cfeConfig.getEMailUserPW());

            //3) create the folder object and open it
            Folder emailFolder = emailStore.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            //4) retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            for (int i = 0; i < messages.length; i++) {
                Message message = messages[i];

                String contentType = message.getContentType();
                String messageContent = "";

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

                                EnvioCFEEntreEmpresas empresasType = null;

                                try{
                                    empresasType = (EnvioCFEEntreEmpresas) jaxbUnmarshaller.unmarshal(fileCFEXml);
                                    System.out.println("***********************ADENDA : " + empresasType.getVersion());
                                }
                                catch (Exception e){
                                    System.out.println(e.getMessage());
                                }
                            }

                        } else {
                            // this part may be the message content
                            messageContent = part.getContent().toString();
                        }
                    }

                    if (attachFiles.length() > 1) {
                        attachFiles = attachFiles.substring(0, attachFiles.length() - 2);
                    }
                } else if (contentType.contains("text/plain")
                        || contentType.contains("text/html")) {
                    Object content = message.getContent();
                    if (content != null) {
                        messageContent = content.toString();
                    }
                }


                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent().toString());
                System.out.println("\t Attachments: " + attachFiles);
            }

            //5) close the store and folder objects
            emailFolder.close(false);
            emailStore.close();
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }
    }
}
