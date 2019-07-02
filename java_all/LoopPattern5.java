public class LoopPattern5{
    public LoopPattern5(){
        int c=10,x,y;
        x=c;
        y=c;
        for(int i=c;i>=0;i--)
        {
            for(int j=0;j<=21;j++){
                if(j>=x && j<=y){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            x--;
            y++;
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern5 lp=new LoopPattern5();
    }
}