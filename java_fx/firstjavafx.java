import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
public class firstjavafx extends Application{
    @Override
    public void start(Stage main) throws Exception{
        main.setTitle("First Fx");
        Label l1=new Label("Hello, this is first try to do something good in FX.\nHope this will better than .py & .c and also easier than swing, less easier than apk");
        Scene s1=new Scene(l1,500,400);
        main.setScene(s1);
        main.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}