public class LoopPattern6{
    public LoopPattern6(){
        for(int i=0;i<=10;i++)
        {
            for(int j=0;j<=10;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern6 lp=new LoopPattern6();
    }
}