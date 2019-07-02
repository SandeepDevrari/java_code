public class LoopPattern17{
    public LoopPattern17(){
        int m=21;
        int b=m/2,c=m/2;
        for(int i=0;i<=10;i++)
        {
            
            //System.out.print("$");
            for(int j=0;j<=m;j++)
            {
                if(j==b || j==c){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            b--;c++;
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern17 lp=new LoopPattern17();
    }
}