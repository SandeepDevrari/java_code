public class Loop31{
    int j,total,pow;
    Loop31(){
        int temp,p;
        
        int in=160;
        
        for(int num=1;num<=in;num++){
            temp=num;p=0;pow=0;total=0;
            while(num>0){
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
            num=temp;
            if(total==temp){
                System.out.print(temp+" ");
            }
        }
    }
    public static void main(String[] args){
        Loop31 lp=new Loop31();
    }
}