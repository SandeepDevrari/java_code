public class LoopPattern3{
    public LoopPattern3(){
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
    }
    public static void main(String[] args){
        LoopPattern3 lp=new LoopPattern3();
    }
}