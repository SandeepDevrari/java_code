import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;
import javafx.scene.paint.Color;
import javafx.animation.FadeTransition;
import javafx.scene.shape.*;
//import java.util.Math;

public class JavafxFadeTransition extends Application{
    private BorderPane home_pane;
    
    @Override
    public void start(Stage main) throws Exception
    {
        home_pane=new BorderPane();
        home_pane.setStyle("-fx-background-color:#7fd9e2");

        Rectangle rect = new Rectangle (100, 40, 100, 100);
        rect.setArcHeight(50);
        rect.setArcWidth(50);
        rect.setFill(Color.RED);
    
        FadeTransition ft = new FadeTransition(Duration.millis(3000), rect);
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setCycleCount(4);
        ft.setAutoReverse(true);
        
        ft.play();
        
        home_pane.setCenter(rect);
        
        
        Scene home_scene=new Scene(home_pane,450,300);
        main.setScene(home_scene);
        main.setTitle("Fade Animation");
        main.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}