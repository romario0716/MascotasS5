package co.siacademica.mascotasS5;


import android.util.Log;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSenderService {
    private final Properties properties = new Properties();

    private String password;

    private Session session;

    private void init() {

        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port",587);
        properties.put("mail.smtp.mail.sender","xxx@gmail.com");
        properties.put("mail.smtp.user", "xxx@gmail.com");
        properties.put("mail.smtp.auth", "true");

        session = Session.getDefaultInstance(properties);
    }

    public void sendEmail(String text, String mail){

        init();
        try{
            final MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress((String)properties.get("mail.smtp.mail.sender")));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("xxx@gmail.com"));
            message.setSubject("siacademica");
            message.setText("Señor(ra): "+mail+" \nMessage:"+text);
            final Transport t = session.getTransport("smtp");


            new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        t.connect((String)properties.get("mail.smtp.user"), "tu clave");
                        t.sendMessage(message, message.getAllRecipients());
                        t.close();
                    } catch (MessagingException e) {
                        e.printStackTrace();
                    }


                }
            }).start();

        }catch (MessagingException me){
            Log.e("ErrorMail", "Ha ocurrido un error al enviar el mail");
            return;
        }

    }

}