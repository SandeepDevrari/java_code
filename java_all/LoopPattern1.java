public class LoopPattern1{
    public LoopPattern1(){
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern1 lp=new LoopPattern1();
    }
}