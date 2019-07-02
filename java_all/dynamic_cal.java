import java.util.Scanner;
class Calculator
{
    float x=0,y=0;
    int ch;
    Scanner scr;
    void add()
    {
        System.out.println("Answer: "+(x+y));
    }
    void sub()
    {
        System.out.println("Answer: "+(x-y));
    }
    void multi()
    {
        System.out.println("Answer: "+(x*y));
    }
    void div()
    {
        if(y!=0)
        {
            System.out.println("Answer: "+(x/y));
        }
        else
        {
            System.out.println("Error!!");
        }
    }
    void menu()
    {
        while(ch!='5')
        {
            System.out.println("\n\t\t\t\tMENU\n\t\t\t1:Add\n\t\t\t2:Subtract\n\t\t\t3:multiply\n\t\t\t4:Divide\n\t\t\t5:Exit");
            scr=new Scanner(System.in);
            ch=scr.nextInt();
            if(ch==1)
            {
                input();
                add();
            }
            else if(ch==2)
            {
                input();
                sub();
            }
            else if(ch==3)
            {
                input();
                multi();
            }
            else if(ch==4)
            {
                input();
                div();
            }
            else
            {
                System.exit(0);
            }
        }
    }
    void input()
    {
        System.out.println("Enter 1st Number:");
        x=scr.nextFloat();
        System.out.println("Enter 2nd Number:");
        y=scr.nextFloat();
    }
    public static void main(String args[])
    {
        Calculator cal=new Calculator();
        cal.menu();
        //cal.input();
    }
}