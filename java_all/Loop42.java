public class Loop42{
    public Loop42(){
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
        //int dec=21;
        String bin="";
        int rem,res=0;
        while(sum>0){
            res=sum/2;
            rem=sum%2;
            sum=res;
            bin=rem+bin;
        }
        System.out.println(bin);
    }
    public static void main(String[] args){
        Loop42 lp=new Loop42();
    }
}