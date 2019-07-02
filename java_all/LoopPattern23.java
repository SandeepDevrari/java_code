public class LoopPattern23{
    public LoopPattern23(){
        for(int i=0;i<=4;i++){
            for(int j=0;j<=3;j++){
                if(i%2==0){
                    System.out.print("*");
                }
                else if(i<4/2 && j==0){
                    System.out.print("*");
                }
                else if(i>4/2 && j==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        int m=8;
        int b=m/2,c=m/2;
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(j==b || j==c){
                    System.out.print("*");
                }
                else if(j>b && j<c && i==4-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            b--;c++;
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                if(j==0 || j==4){
                    System.out.print("*");
                }
                else if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                if(i==0 || i==4){
                    System.out.print("*");
                }
                else if(j==1||j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<=4;i++){
            for(int j=0;j<=3;j++){
                if(i%2==0){
                    System.out.print("*");
                }
                else if(j==0){
                    System.out.print("*");
                }
                //else if(i>4/2 && j==3){
                //    System.out.print("*");
                //}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<=4;i++){
            for(int j=0;j<=3;j++){
                if(i%2==0){
                    System.out.print("*");
                }
                else if(j==0){
                    System.out.print("*");
                }
                //else if(i>4/2 && j==3){
                //    System.out.print("*");
                //}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<=5;i++){
            for(int j=0;j<=6;j++){
                if(i%2==0 && i<=5/2){
                    System.out.print("*");
                }
                else if(j==0 || (j==6 && i<5/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        LoopPattern23 lp=new LoopPattern23();
    }
}