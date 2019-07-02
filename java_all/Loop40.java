public class Loop40{
    public Loop40(){
        String bin="111001";
        String temp="";
        int pow,sum=0;
        for(int i=bin.length(),j=0;i>0;i--,j++){
            temp=bin.substring(i-1,i);
            pow=1;
            for(int c=0;c<j;c++)
            {
                pow=pow*2;
            }
            sum=sum+(Integer.parseInt(temp)*pow);
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Loop40 lp=new Loop40();
    }
}