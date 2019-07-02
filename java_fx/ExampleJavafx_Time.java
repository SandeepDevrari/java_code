import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.*;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.event.EventHandler;
import javafx.util.Duration;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Locale;
import java.time.Year;
import java.time.Month;
import java.time.MonthDay;
import java.time.DayOfWeek;
import java.time.format.TextStyle;

public class ExampleJavafx_Time extends Application{
    //int i=1;
    LocalTime time_now;
    LocalDate date_now;
    Year year_now;
    Month month_now;
    MonthDay month_day_now;
    DayOfWeek dayofweek_now;
    String time_show;
    String data_show;
    @Override
    public void start(Stage main) throws Exception
    {
        
        AnchorPane ap=new AnchorPane();
        
        Label time=new Label(" hello");
   
        Timeline timeline = new Timeline(
            new KeyFrame(
                Duration.millis(1),
                event -> {
                    //i++;
                    /*LocalTime*/ time_now=LocalTime.now();
                    /*LocalDate*/ date_now=LocalDate.now();
                    /*Year*/ year_now=Year.now();
                    /*Month*/ month_now=Month.from(date_now);
                    /*MonthDay*/ month_day_now=MonthDay.from(date_now);
                    /*DayOfWeek*/ dayofweek_now=DayOfWeek.from(date_now);
                    /*String*/ time_show=time_now.toString();
                    /*String*/ data_show=dayofweek_now.getDisplayName(TextStyle.SHORT,Locale.getDefault())+", "+month_day_now.getDayOfMonth()+" "+month_now.getDisplayName(TextStyle.SHORT,Locale.getDefault())+" "+year_now;
                    time.setText("\n "+time_show+"\n "+data_show);
                }
            )
        );  
        timeline.setCycleCount( Animation.INDEFINITE );
        timeline.play();
        
        ap.getChildren().addAll(time);
        
        Scene start_scene=new Scene(ap,300,300);
        main.setScene(start_scene);
        main.setTitle("Time Anim");
        main.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}