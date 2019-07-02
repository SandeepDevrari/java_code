public class Loop4{
    Loop4(){
        int i=1;
        while(i<101){
            if(i%2==0)
                System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args){
        Loop4 lp=new Loop4();
    }
}