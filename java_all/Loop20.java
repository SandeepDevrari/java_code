public class Loop20{
    char c;
    Loop20(){
        for(int i=0;i<127;i++){
           c=(char)(i);
           System.out.print(c+" ");
        }
    }
    public static void main(String[] args){
        Loop20 lp=new Loop20();
    }
}