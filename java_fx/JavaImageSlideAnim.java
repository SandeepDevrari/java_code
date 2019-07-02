import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Animation;

import java.io.FileInputStream;

public class JavaImageSlideAnim extends Application{

  class SimpleSlideShow {

    StackPane root = new StackPane();
    ImageView[] slides;

    public SimpleSlideShow() {
      this.slides = new ImageView[3];
      try{
      Image image1 = new Image(new FileInputStream("cards_pic01.png"));
      Image image2 = new Image(new FileInputStream("e-wallet_payment_pic01.png"));
      Image image3 = new Image(new FileInputStream("wallet_pic01.png"));
      //Image image4 = new Image(new FileInputStream("fire.png"));
      slides[0] = new ImageView(image1);
      slides[1] = new ImageView(image2);
      slides[2] = new ImageView(image3);
      //slides[3] = new ImageView(image4);
      }catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
    }

    public StackPane getRoot() {
      return root;
    }

    // The method I am running in my class

    public void start() {

      SequentialTransition slideshow = new SequentialTransition();

      for (ImageView slide : slides) {
      //for(int i=0;i<4;i++){
        SequentialTransition sequentialTransition = new SequentialTransition();
        //sequentialTransition.setCycleCount(Animation.INDEFINITE);
        //sequentialTransition.setAutoReverse(true);
        
        //ImageView slide=slides[i];
        
        FadeTransition fadeIn = getFadeTransition(slide, 0.0, 1.0, 2000);
        PauseTransition stayOn = new PauseTransition(Duration.millis(2000));
        FadeTransition fadeOut = getFadeTransition(slide, 1.0, 0.0, 2000);

        sequentialTransition.getChildren().addAll(fadeIn, stayOn, fadeOut);
        slide.setOpacity(0);
        
        
        
        this.root.getChildren().add(slide);
        slideshow.getChildren().add(sequentialTransition);

      }
      slideshow.play();
    }

// the method in the Transition helper class:

    public FadeTransition getFadeTransition(ImageView imageView, double fromValue, double toValue, int durationInMilliseconds) {

      FadeTransition ft = new FadeTransition(Duration.millis(durationInMilliseconds), imageView);
      ft.setFromValue(fromValue);
      ft.setToValue(toValue);

      return ft;

    }
  }

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    SimpleSlideShow simpleSlideShow = new SimpleSlideShow();
    Scene scene = new Scene(simpleSlideShow.getRoot());
    primaryStage.setScene(scene);
    primaryStage.show();
    simpleSlideShow.start();
  }
}