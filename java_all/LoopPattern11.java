public class LoopPattern11{
    public LoopPattern11(){
        int c=10;
        for(int i=0;i<=c;i++){
            for(int j=0;j<=c;j++)
            {
                if(i==0 || i==c){
                    System.out.print("*");
                }
                else{
                    if(j==0 || j==c){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern11 lp=new LoopPattern11();
    }
}