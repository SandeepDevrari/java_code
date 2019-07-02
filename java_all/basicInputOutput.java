import java.util.Scanner;
class BasicIO
{
    Scanner scr;
    int roll;
    String name;
    float perc;
    void get()
    {
        scr=new Scanner(System.in);
        System.out.println("Enter Name:");
        name=scr.nextLine();
        System.out.println("Enter Roll Number:");
        roll=scr.nextInt();
        System.out.println("Enter Percentage:");
        perc=scr.nextFloat();
    }
    void show()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);
        System.out.println("Percentage: "+perc);
    }
    public static void main(String args[])
    {
        BasicIO io=new BasicIO();
        io.get();
        io.show();
    }
}
