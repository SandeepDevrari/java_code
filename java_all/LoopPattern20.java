public class LoopPattern20{
    public LoopPattern20(){
        int c=20,a=c/2;
        for(int i=0;i<=c;i++){
            for(int j=0;j<=c;j++)
            {
                if(i==c/2){
                    System.out.print("*");
                }
                else{
                    if(j==a){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            if(i<(c/2)-1){
                a++;
            }
            else if(i>c/2){
                a--;
            }
            System.out.println("");
        }
        //System.out.println(a+" "+b);
    }
    public static void main(String[] args){
        LoopPattern20 lp=new LoopPattern20();
    }
}