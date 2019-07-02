public class Loop49{
    public Loop49(){
        String hex="2A5";
        String temp="";
        int pow,sum=0;
        for(int i=hex.length(),j=0;i>0;i--,j++){
            temp=hex.substring(i-1,i);
            pow=1;
            for(int c=0;c<j;c++)
            {
                pow=pow*16;
            }
            if(temp.equals("A")){
                temp="10";
            }
            else if(temp.equals("B")){
                temp="11";
            }
            else if(temp.equals("C")){
                temp="12";
            }
            else if(temp.equals("D")){
                temp="13";
            }
            else if(temp.equals("E")){
                temp="14";
            }
            else if(temp.equals("F")){
                temp="15";
            }
            sum=sum+(Integer.parseInt(temp)*pow);
        }
        int dec=sum;
        String bin="";
        int rem,res=0;
        while(dec>0){
            res=dec/8;
            rem=dec%8;
            dec=res;
            bin=rem+bin;
        }
        System.out.println(bin);
    }
    public static void main(String[] args){
        Loop49 lp=new Loop49();
    }
}