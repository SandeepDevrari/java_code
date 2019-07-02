public class LoopPattern22{
    public LoopPattern22(){
        int y=1;
        for(int i=0;i<=5;i++)
        {
            //for(int j=0;j<=i;j++)
            //{
                for(int c=0;c<=1;c++){
                    for(int d=0;d<=y;d++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                y=y+2;
            //}
            //System.out.println("");
        }
    }
    public static void main(String[] args){
        LoopPattern22 lp=new LoopPattern22();
    }
}