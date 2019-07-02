public class Loop19{
    int prod;
    char c;
    Loop19(){
        int i=334422;
        while(i!=0){
            prod=i%10;
            i=i/10;
            if(prod==0){
                System.out.print("zero ");
            }
            else if(prod==1){
                System.out.print("one ");
            }
            else if(prod==2){
                System.out.print("two ");
            }
            else if(prod==3){
                System.out.print("three ");
            }
            else if(prod==4){
                System.out.print("four ");
            }
            else if(prod==5){
                System.out.print("five ");
            }
            else if(prod==6){
                System.out.print("six ");
            }
            else if(prod==7){
                System.out.print("seven ");
            }
            else if(prod==8){
                System.out.print("eight ");
            }
            else if(prod==9){
                System.out.print("nine ");
            }
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Loop19 lp=new Loop19();
    }
}