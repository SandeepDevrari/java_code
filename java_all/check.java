import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.FileInputStream;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.beans.value.*;
import javafx.scene.layout.AnchorPane;
public class check extends Application{
    
    private double W=1100.00,H=720.00;
    @Override
    public void start(Stage main) throws Exception
    {
        Label l=new Label("",new ImageView(new Image(new FileInputStream("images\\ewallet.png"))));
        Label l1=new Label("",new ImageView(new Image(new FileInputStream("images\\ewallet.png"))));
        l.setLayoutX((W/2)-61);
        l.setLayoutY((H/2)-61);
        //l.setMinSize(50,20);
        
        l1.setLayoutX(100);
        l1.setLayoutY(H-120);
       // l1.setMinSize(50,20);
        
        AnchorPane root=new AnchorPane();
        //root.setPrefSize(800,800);
        root.getChildren().addAll(l,l1);
        
        Scene s=new Scene(root,W,H);
        
        main.setScene(s);
        main.setTitle("ye ni ho ra");
        main.show();
        
        Delta dragDelta = new Delta();
        l.setOnMousePressed(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e)
            {
                dragDelta.x = l.getLayoutX() - e.getSceneX();
                dragDelta.y = l.getLayoutY() - e.getSceneY();
                //l.setLayoutX(e.getSceneX());
                //l.setLayoutY(e.getSceneY());
            }
        });
        l.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e)
            {
            l.setLayoutX(e.getSceneX() + dragDelta.x);
            l.setLayoutY(e.getSceneY() + dragDelta.y);
            System.out.println(e.getSceneX() + dragDelta.x);
            System.out.println(e.getSceneY() + dragDelta.y);
            }
        });
        
        s.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
                //System.out.println("Width: " + newSceneWidth);
                W=Double.parseDouble(newSceneWidth.toString());
                l.setLayoutX((W/2)-61);
            }
        });
        s.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
                //System.out.println("Height: " + newSceneHeight);
                H=Double.parseDouble(newSceneHeight.toString());
                l.setLayoutY((H/2)-61);
                l1.setLayoutY(H-120);
            }
        });
    }
    public static void main(String[] args)
    {
        launch(args);
    }
    class Delta {
        double x;
        double y; 
    }
}