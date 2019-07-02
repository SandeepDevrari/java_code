public class Loop22{
    Loop22(){
        int num=10;
        double total=num;
        int i=1;
        while(num>1){
            num--;
            total=total*(num);
            i++;
        }
        System.out.println(total);
    }
    public static void main(String[] args){
        Loop22 lp=new Loop22();
    }
}