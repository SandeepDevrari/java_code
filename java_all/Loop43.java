public class Loop43{
    public Loop43(){
        int oct=25;
        int pow,sum=0,n,i,j=0;
        n=oct;
        while(n>0){
            i=n%10;
            pow=1;
            for(int c=0;c<j;c++)
            {
                pow=pow*8;
            }
            sum=sum+(i*pow);
            n=n/10;
            j++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Loop43 lp=new Loop43();
    }
}