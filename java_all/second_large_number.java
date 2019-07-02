import java.util.Scanner;
class SecondLargeNumber
{
    int n,max_num=0,temp=0;
    void secondLarge()
    {
        int num;
        System.out.println("Enter Total:");
        Scanner scr=new Scanner(System.in);
        n=scr.nextInt();
        System.out.println("Enter Number:");
        num=scr.nextInt();
        max_num=num;
        for(int i=1;i<=n;i++)
        {
            if(num>max_num)
            {
                temp=max_num;
                max_num=num;
            }
            else if(num<max_num)
            {
                if(num>temp)
                {
                    temp=num;
                }
            }
            if(i<n)
            {
                System.out.println("Enter Number:");
                num=scr.nextInt();
            }
        }
    }
    void show()
    {
        System.out.println("Second Large Number: "+temp);
    }
    public static void main(String args[])
    {
        SecondLargeNumber secondlarge=new SecondLargeNumber();
        secondlarge.secondLarge();
        secondlarge.show();
    }
}