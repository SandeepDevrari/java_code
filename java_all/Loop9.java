public class Loop9{
    int s=1;
    Loop9(){
        int i=5;
        while(i*s<=i*10){
            System.out.println(i*(s++));
            //s++;
        }
        
    }
    public static void main(String[] args){
        Loop9 lp=new Loop9();
    }
}