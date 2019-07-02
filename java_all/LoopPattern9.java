public class LoopPattern9{
    public LoopPattern9(){
        for(int i=10;i>=0;i--)
        {
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern9 lp=new LoopPattern9();
    }
}