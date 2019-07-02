import java.util.*;
import org.controlsfx.control.Notifications;
import javafx.util.Duration;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.application.Application;
import java.io.FileInputStream;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Node;
public class GenOTP extends Application
{
    /*static char[] OTP(int len)
    {
        int otpint=0;
        String numbers="20171001";
        Random rnd=new Random();
        char[] mypwd = new char[len];
        for (int i = 0; i < len; i++)
        {
            mypwd[i] =numbers.charAt(rnd.nextInt(numbers.length()));
        }
        String temp=numbers.substring(0,1);
        for(int i=0;i<numbers.length();i++)
        {
            otpint=otpint+Integer.parseInt(numbers.substring(i,i+1));
        }
        System.out.println(otpint);
        try{
        Notifications.create()
            .title("OTP")
            .text("otpSended")
            //.graphic(icon)
            .position(Pos.BOTTOM_CENTER)
            .hideAfter(Duration.seconds(5))
        .show();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return mypwd;
    }*/
        @Override
    public void start(Stage main) throws Exception
    {
        try{
         AnchorPane ADHome=new AnchorPane();
         Button bt=new Button("click");
        ADHome.getChildren().add(bt);
        Node gra=new ImageView(new Image(new FileInputStream("otp.png")));
        bt.setOnAction(new EventHandler<ActionEvent>(){
            @Override
                public void handle(ActionEvent e)
                {
                    String idstudent="20171001",otp="5219@CSE";
                    Notifications.create()
                        .title("OTP")
                        .text("OTP: "+otp+" has Sended To "+idstudent)
                        .graphic(gra)
                        //.darkStyle()
                        //.position(Pos.BOTTOM_CENTER)
                        .hideAfter(Duration.seconds(8))
                        //.owner(ADHome)
                        .show();
                }
        });
        
        
        Scene s=new Scene(ADHome,300,400);
        main.setScene(s);
        main.setTitle("HELL");
        main.show();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args)
    {
        launch(args);
        //int length = 6;
        //System.out.println("OTP Generated is "+OTP(length));
    }
}