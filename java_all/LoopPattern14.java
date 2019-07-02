public class LoopPattern14{
    public LoopPattern14(){
        for(int i=10;i>=0;i--)
        {
            for(int j=0;j<=10;j++){
                if(j>=i)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i=0;i<=10;i++)
        {
            for(int j=0;j<=10;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern14 lp=new LoopPattern14();
    }
}