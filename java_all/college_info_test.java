
    import java.util.Scanner;
class College
{
    Scanner scr;
    String CNM,CTYPE;
    void getInfo()
    {
        scr=new Scanner(System.in);
        System.out.println("Enter College Name:");
        CNM=scr.nextLine();
        System.out.println("Enter College Type:");
        CTYPE=scr.next();
    }
    void showInfo()
    {
        System.out.println("\nCollege Name: "+CNM);
        System.out.println("\nCollege Type: "+CTYPE);
    }
}
class Exam extends College
{
    String EID,EVENUE; 
    void get()
    {
        System.out.println("Enter Exam Id:");
        EID=scr.next();
        System.out.println("Enter Exam Venue:");
        EVENUE=scr.next();
    }
    void show()
    {
        System.out.println("\nExam Id: "+EID);
        System.out.println("\nExam Venue: "+EVENUE);
    }
    public static void main(String args[])
    {
        Exam exm=new Exam();
        exm.get();
        exm.getInfo();
     
        exm.showInfo();
        exm.show();
    }
}