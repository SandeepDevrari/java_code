import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//import javafx.animation.FadeTransition;

import java.io.FileInputStream;

public class JavafxImageAutoChangeTransition extends Application{
    private BorderPane home_pane;
    private ImageView[] slides;
    private ImageView imv;
    //private FadeTransition fade;
    //private int i=0;
    
    @Override
    public void start(Stage main) throws Exception
    {
        home_pane=new BorderPane();
        home_pane.setStyle("-fx-background-color:#7fd9e2");

        //fade=new FadeTransition(Duration.millis(3000),imv);
        slides = new ImageView[3];
        
        try{
            Image image1 = new Image(new FileInputStream("cards_pic01.png"));
            Image image2 = new Image(new FileInputStream("e-wallet_payment_pic01.png"));
            Image image3 = new Image(new FileInputStream("wallet_pic01.png"));

            slides[0] = new ImageView(image1);
            slides[1] = new ImageView(image2);
            slides[2] = new ImageView(image3);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        final Animation anim=new Transition(){
            {
                setCycleDuration(Duration.millis(7000));
                setCycleCount(Animation.INDEFINITE);
            }
            
            protected void interpolate(double frac)
            {
                imv=slides[Math.round(2*(float)frac)];
                
                
                //fade.setFromValue(1.0);
                //fade.setToValue(0.3);
              
                home_pane.setCenter(imv);
                
            }
        };
        
        anim.play();
        
        //home_pane.setCenter(txt);
        
        
        Scene home_scene=new Scene(home_pane,650,500);
        main.setScene(home_scene);
        main.setTitle("Image Animation");
        main.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}