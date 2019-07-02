public class Loop39{
    public Loop39(){
        String oct="1101010111001111";
        String temp="";
        int i=oct.length(),reminder;
        if(i%3==0){
            //
        }
        else{
            reminder=i%3;
            reminder=3-reminder;
            for(int j=1;j<=reminder;j++){
                oct="0"+oct;
            }
            
        }
        i=oct.length();
        String bin="";
        String binary="";
        int pow,sum;
        while(i>0){
            sum=0;
            bin=oct.substring(i-3,i);
            i=i-3;
            for(int x=bin.length(),y=0;x>0;x--,y++){
                temp=bin.substring(x-1,x);
                pow=1;
                for(int c=0;c<y;c++)
                {
                    pow=pow*2;
                }
                sum=sum+(Integer.parseInt(temp)*pow);
            }
            binary=sum+binary;
            //System.out.println(sum);
        }
        System.out.println(binary);
    }
    public static void main(String[] args){
        Loop39 lp=new Loop39();
    }
}