public class Loop7{
    int sum;
    Loop7(){
        int i=1;
        while(i<101){
            if(i%2==0)
                sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Loop7 lp=new Loop7();
    }
}