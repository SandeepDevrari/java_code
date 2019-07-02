public class LoopPattern18{
    public LoopPattern18(){
        int c=10;
        for(int i=c;i>=0;i--){
            for(int j=0;j<=c;j++)
            {
                if(i==c/2){
                    System.out.print("*");
                }
                else{
                    if(j==c/2){
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
        LoopPattern18 lp=new LoopPattern18();
    }
}