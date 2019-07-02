public class Loop34{
    int i;
    Loop34(){
        int num=145;
        int num1=num;
        double total,sum=0;
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
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not Strong number");
        }
    }
    public static void main(String[] args){
        Loop34 lp=new Loop34();
    }
}