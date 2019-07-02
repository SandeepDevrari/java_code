public class Loop30{
    int j,total,pow;
    Loop30(){
        int num=153;
        int temp=num,p=0;
        while(num>0){
            //p=num%10;
            num=num/10;
            pow++;
        }
        num=temp;
        while(num>0){
            p=num%10;
            j=p;
            for(int i=2;i<=pow;i++){
                j=j*p;
            }
            total=total+j;
            num=num/10;
        }
        if(total==temp){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not Armstrong number");
        }
    }
    public static void main(String[] args){
        Loop30 lp=new Loop30();
    }
}