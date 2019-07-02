public class Loop33{
    int i=2;
    Loop33(){
        int num=0,sum=1;
        
        int in=30;
        
        for(int c=1;c<=in;c++){
            num=c;i=2;
            sum=1;
            while(i*i<=num){
                if(num%i==0)
                    sum=sum+i+(num/i);
                i++;
            }
            if(sum==num){
                System.out.print(num+" ");
            }
        }
    }
    public static void main(String[] args){
        Loop33 lp=new Loop33();
    }
}