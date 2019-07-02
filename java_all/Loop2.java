public class Loop2{
    Loop2(){
        int n=100;
        while(n>0){
            System.out.println(n--);
        }
    }
    public static void main(String[] args){
        Loop2 lp=new Loop2();
    }
}