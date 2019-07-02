public class Loop5{
    Loop5(){
        int i=1;
        while(i<101){
            if(i%2!=0)
                System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args){
        Loop5 lp=new Loop5();
    }
}