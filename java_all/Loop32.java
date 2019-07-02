public class Loop32{
    int i=2;
    Loop32(){
        int num=7;
        int sum=1;
        while(i*i<=num){
            if(num%i==0)
                sum=sum+i+(num/i);
            i++;
        }
        if(sum==num){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not Perfect number");
        }
    }
    public static void main(String[] args){
        Loop32 lp=new Loop32();
    }
}