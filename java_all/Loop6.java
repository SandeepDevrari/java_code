public class Loop6{
    int sum;
    Loop6(){
        int i=1;
        while(i<101){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Loop6 lp=new Loop6();
    }
}