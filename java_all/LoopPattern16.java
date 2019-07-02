public class LoopPattern16{
    public LoopPattern16(){
        int c=11,x,y;
        x=0;
        y=22;
        for(int i=0;i<=c;i++)
        {
            for(int j=0;j<=22;j++){
                if(j>x && j<y){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            x++;
            y--;
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern16 lp=new LoopPattern16();
    }
}