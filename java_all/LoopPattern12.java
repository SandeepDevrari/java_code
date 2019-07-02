public class LoopPattern12{
    public LoopPattern12(){
        int m=10;
        int b=0,c=m;
        for(int i=0;i<=10;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(j==b || j==c){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            b++;c--;
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern12 lp=new LoopPattern12();
    }
}