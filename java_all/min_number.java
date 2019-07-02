import java.util.Scanner;
class MinNumber
{
    int n,min_num=0;
    void min()
    {
        int num;
        System.out.println("Enter Total:");
        Scanner scr=new Scanner(System.in);
        n=scr.nextInt();
        System.out.println("Enter Number:");
        num=scr.nextInt();
        min_num=num;
        for(int i=1;i<=n;i++)
        {
            if(num<min_num)
            {
                min_num=num;
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
        System.out.println("Minmum Number: "+min_num);
    }
    public static void main(String args[])
    {
        MinNumber findMin=new MinNumber();
        findMin.min();
        findMin.show();
    }
}