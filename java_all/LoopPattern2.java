public class LoopPattern2{
    public LoopPattern2(){
        for(int i=10;i>=0;i--)
        {
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern2 lp=new LoopPattern2();
    }
}