public class LoopPattern13{
    public LoopPattern13(){
        int c=10;
        for(int i=c;i>=0;i--){
            for(int j=0;j<=c;j++)
            {
                if(i==0 || i==c){
                    System.out.print("*");
                }
                else{
                    if(j==i){
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
        LoopPattern13 lp=new LoopPattern13();
    }
}