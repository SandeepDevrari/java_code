public class Loop3{
    Loop3(){
        char i='a';
        while(i!='z'){
            System.out.println(i++);
        }
        System.out.println(i);
    }
    public static void main(String[] args){
        Loop3 lp=new Loop3();
    }
}