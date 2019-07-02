public class LoopPattern19{
    public LoopPattern19(){
        int c=10,a=0,b=0;
        for(int i=0;i<=c;i++){
            for(int j=0;j<=c;j++)
            {
                if(i==c){
                    System.out.print("*");
                }
                else{
                    if(j==a || j==b){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            b++;
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern19 lp=new LoopPattern19();
    }
}