import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
import java.util.*;    
public class MyMailCode  
{  
 public static void main(String [] args)
    { 
    
    String to = "sandeepdevrari77@gmail.com";
    String pwd="SuSi.97#";
    String from = "sandeepdevrari77@gmail.com";
    //String host = "192.168.1.101";
    Properties properties = System.getProperties();
    properties.put("mail.smtp.starttls.enable","true");
    properties.put("mail.smtp.host","smtp.gmail.com");
    properties.put("mail.smtp.port","587");
    //properties.setProperty("mail.smtp.host", host);  
    Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator(){
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(to,pwd);
        }
    });  
    try{  
       MimeMessage message = new MimeMessage(session);  
       message.setFrom(new InternetAddress(from));  
       message.setRecipient(Message.RecipientType.TO,InternetAddress.parse(to));  
       message.setSubject("Test mail ");  
       message.setText("just checking if the mailing service workinng or not ");  
       Transport.send(message);  
       System.out.println("Mail has been sent successfully....");  
      }
	catch (Exception ex)
	{
		ex.printStackTrace();
        System.out.println(ex.getMessage());
	}  
   }  
}  