public class Loop1{
    Loop1(){
        int i=1,n=100;
        while(i<=n){
            System.out.println(i++);
        }
    }
    public static void main(String[] args){
        Loop1 lp=new Loop1();
    }
}