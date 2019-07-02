public class Loop48{
    public Loop48(){
        String hex="15";
        String temp="",binary="";
        int pow,dec=0;
        for(int i=hex.length(),j=0;i>0;i--,j++){
            temp=hex.substring(i-1,i);
            pow=1;
            //for(int c=0;c<j;c++)
            //{
            //    pow=pow*16;
            //}
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
            dec=(Integer.parseInt(temp)*pow);
            //System.out.println(dec);
            String bin="";
            int rem,res=0;
            while(dec>0){
                res=dec/2;
                rem=dec%2;
                dec=res;
                bin=rem+bin;
            }
            //System.out.println(bin);
            int s=bin.length(),reminder;
            if(s%4==0){
                //
            }
            else{
                reminder=s%4;
                reminder=4-reminder;
                for(int p=1;p<=reminder;p++){
                    bin="0"+bin;
                }
                //System.out.println(bin);
            }
            binary=bin+binary;
        }
        System.out.println(binary);
    }
    public static void main(String[] args){
        Loop48 lp=new Loop48();
    }
}