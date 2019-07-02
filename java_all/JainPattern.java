import java.util.*;
public class JainPattern{
    public JainPattern()
    {
        int time,copytime,looptime;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        time=in.nextInt();
        copytime=time;
        looptime=time;
        while(copytime!=0)
        {
            copytime--;
            for(int i=1;i<=time;i++)
            {
                System.out.print(i);
                
            }
            if(looptime-time>0)
            {
                for(int b=1;b<=looptime-time;b++)
                {
                    System.out.print("  ");
                }
            }
            for(int j=time;j>0;j--)
            {
               
                System.out.print(j);
            }
            time--;
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        JainPattern jp=new JainPattern();
    }
}