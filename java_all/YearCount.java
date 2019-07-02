import java.util.Scanner;

public class YearCount{
    public YearCount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Course year:");
        int c_yr=sc.nextInt();
        System.out.println("Enter current Course year:");
        int current_yr=sc.nextInt();
        System.out.println("Enter current year:");
        int yr_now=sc.nextInt();
        System.out.println("Are you lateral(y/n):");
        String state=sc.next();
        int j=-1;
        if(state.equals("n")){
        for(int i=1;i<=c_yr;i++)
        {
            j=j+1;
            if(i==current_yr)
                break;
        }
        }
        else
        {
           for(int i=2;i<=current_yr;i++)
            {
                j=j+1;
                //if(i==current_yr)
                  //  break;
            } 
        }
        int join_yr=yr_now-j;
        if(j==0){
            System.out.println("session start: "+join_yr+" end will be in: "+(++join_yr));
        }
        else{
        for(int i=1;i<=j;i++)
        {
            System.out.println("session start: "+join_yr+" end: "+(++join_yr));
        }}
        System.out.println("you have years: "+j);
        
    }
    public static void main(String[] args)
    {
        YearCount yc=new YearCount();
    }
}