public class LoopPattern8{
    public LoopPattern8(){
        int c=11,x,y;
        x=c;
        y=c;
        for(int i=c;i>=0;i--)
        {
            for(int j=0;j<=22;j++){
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
        c=11;
        x=0;
        y=22;
        for(int i=0;i<=c;i++)
        {
            for(int j=0;j<=22;j++){
                if(j>=x && j<=y){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            x++;
            y--;
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern8 lp=new LoopPattern8();
    }
}