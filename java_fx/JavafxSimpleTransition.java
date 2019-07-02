import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.animation.Transition;
//import java.util.Math;

public class JavafxSimpleTransition extends Application{
    private BorderPane home_pane;
    private final String str="SANDEEP DEVRARI";
    private Text txt;
    //private int i=0;
    
    @Override
    public void start(Stage main) throws Exception
    {
        home_pane=new BorderPane();
        home_pane.setStyle("-fx-background-color:#7fd9e2");

        txt=new Text(10,20,"");
        
        final Animation anim=new Transition(){
            {
                setCycleDuration(Duration.millis(7000));
                setCycleCount(Animation.INDEFINITE);
            }
            
            protected void interpolate(double frac)
            {
                //System.out.println("Frac "+frac);
                //final int len=str.length();
                //final int n=Math.round(str.length()*(float)frac);
                //System.out.println("n "+n);
                txt.setText(str.substring(0,Math.round(str.length()*(float)frac)));
                
                //txt.setText(str.substring(0,i));
                //i++;
            }
        };
        
        anim.play();
        
        home_pane.setCenter(txt);
        
        
        Scene home_scene=new Scene(home_pane,450,300);
        main.setScene(home_scene);
        main.setTitle("Image Animation");
        main.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}