public class Loop44{
    public Loop44(){
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
        int dec=sum;
        String hex="";
        int rem,res=0;
        while(dec>0){
            res=dec/16;
            rem=dec%16;
            dec=res;
            if(rem>9){
                if(rem==10){
                    hex="A"+hex;
                }
                else if(rem==11){
                    hex="B"+hex;
                }
                else if(rem==12){
                    hex="C"+hex;
                }
                else if(rem==13){
                    hex="D"+hex;
                }
                else if(rem==14){
                    hex="E"+hex;
                }
                else if(rem==15){
                    hex="F"+hex;
                }
            }
            else{
               hex=rem+hex; 
            }
            
        }
        System.out.println(hex);
    }
    public static void main(String[] args){
        Loop44 lp=new Loop44();
    }
}