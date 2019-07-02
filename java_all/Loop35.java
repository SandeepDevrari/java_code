public class Loop35{
    int i;
    Loop35(){
        double total,sum;
        int num,num1;
        int in=146;
        
        for(int a=1;a<=in;a++){
            num=a;
            num1=num;
            sum=0;
            while(num1>0){
                i=num1%10;
                total=i;
                while(i>2){
                    i--;
                    total=total*(i);
                }
                sum=sum+total;
                num1=num1/10;
            }
            if(sum==num){
                System.out.print(num+" ");
            }
        }
    }
    public static void main(String[] args){
        Loop35 lp=new Loop35();
    }
}