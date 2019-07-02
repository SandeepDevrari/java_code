import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
public class JavaDateClass{
    public JavaDateClass()throws ParseException{
        SimpleDateFormat ss=new SimpleDateFormat("mm/dd/yy");
        Date date=ss.parse("12/05/2014");
        System.out.println(date);
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.compareTo(date));
        Calendar calendar = Calendar.getInstance();  
        System.out.println("The current date is : " + calendar.getTime());  
        calendar.add(Calendar.DATE, -15);  
        System.out.println("15 days ago: " + calendar.getTime());  
        calendar.add(Calendar.MONTH, 4);  
        System.out.println("4 months later: " + calendar.getTime());  
        calendar.add(Calendar.YEAR, 2);  
        System.out.println("2 years later: " + calendar.getTime());
        System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));  
        System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));
        calendar.clear();
        calendar = Calendar.getInstance();
        
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
    }
    public static void main(String[] args){
        try{
        JavaDateClass jj=new JavaDateClass();
        }catch(ParseException pp){
            pp.printStackTrace();
        }
    }
}