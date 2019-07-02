public class RV_Test_Pattern_Day_1{

    RV_Test_Pattern_Day_1(){
        int b=3,c=3;
        for(int i=0;i<=4;i++)
        {
            
            //System.out.print("$");
            for(int j=0;j<=6;j++)
            {
                if(j==b){
                System.out.print("*");
                b--;
                }
                if(j==c)
                {
                    if(b+1==c)
                    {
                        c++;
                        break;
                    }
                    else{
                    System.out.print("*");
                    c++;
                    break;
                    }
                }
                else{
                    System.out.print(" ");
                }
                //break;
                
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        RV_Test_Pattern_Day_1 t=new RV_Test_Pattern_Day_1();
       
    }
}