import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Locale;
import java.time.Year;
import java.time.Month;
import java.time.MonthDay;
import java.time.DayOfWeek;
import java.time.format.TextStyle;

import java.util.Timer;
import java.util.TimerTask;

public class ExampleJava_Time{
    
    public ExampleJava_Time()
    {
        //for(int i=1;i<=10;i++){
            final Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                int j = 10;
                public void run() {
                    j--;
                    LocalTime time_now=LocalTime.now();
                    LocalDate date_now=LocalDate.now();
                    Year year_now=Year.now();
                    Month month_now=Month.from(date_now);
                    MonthDay month_day_now=MonthDay.from(date_now);
                    DayOfWeek dayofweek_now=DayOfWeek.from(date_now);
                    String time_show=time_now.toString();
                    String data_show=dayofweek_now.getDisplayName(TextStyle.SHORT,Locale.getDefault())+", "+month_day_now.getDayOfMonth()+" "+month_now.getDisplayName(TextStyle.SHORT,Locale.getDefault())+" "+year_now;
                    System.out.println("\n "+time_show+"\n "+data_show);
                    if (j< 0){
                        timer.cancel();
                    }
                }
            }, 0, 1000);
        //}
    }
    
    public static void main(String[] args)
    {
        ExampleJava_Time ii=new ExampleJava_Time();
    }
}