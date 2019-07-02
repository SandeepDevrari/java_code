public class Loop8{
    int sum;
    Loop8(){
        int i=1;
        while(i<101){
            if(i%2!=0)
                sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Loop8 lp=new Loop8();
    }
}