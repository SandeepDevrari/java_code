public class Loop50{
    public Loop50(){
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
        System.out.println(sum);
    }
    public static void main(String[] args){
        Loop50 lp=new Loop50();
    }
}