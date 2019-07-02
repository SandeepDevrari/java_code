import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;

import java.io.FileInputStream;

public class JavafxSequenceTransition extends Application{
    private BorderPane home_pane;
    private ImageView[] slides;
    private ImageView imv;
    private int i=0;
    
    @Override
    public void start(Stage main) throws Exception
    {
        home_pane=new BorderPane();
        home_pane.setStyle("-fx-background-color:#7fd9e2");

        slides = new ImageView[3];
        
        try{
            Image image1 = new Image(new FileInputStream("cards_pic01.png"));
            Image image2 = new Image(new FileInputStream("e-wallet_payment_pic01.png"));
            Image image3 = new Image(new FileInputStream("wallet_pic01.png"));

            slides[0] = new ImageView(image1);
            slides[1] = new ImageView(image2);
            slides[2] = new ImageView(image3);
            imv=slides[i];
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        Timeline timeline = new Timeline();

        KeyValue transparent = new KeyValue(imv.opacityProperty(), 0.0);
        KeyValue opaque = new KeyValue(imv.opacityProperty(), 1.0);
        
        KeyFrame startFadeIn = new KeyFrame(Duration.ZERO, transparent);
        KeyFrame endFadeIn = new KeyFrame(Duration.millis(5000), opaque);
        KeyFrame startFadeOut = new KeyFrame(Duration.millis(5000), opaque);
        KeyFrame endFadeOut = new KeyFrame(Duration.millis(5000), e -> {
            if (i < 3) {
                imv=slides[i];
                i++ ;
            }
        }, transparent);
        
        timeline.getKeyFrames().addAll(startFadeIn, endFadeIn, startFadeOut, endFadeOut);
        
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        
        home_pane.setCenter(imv);
        
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