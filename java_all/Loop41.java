public class Loop41{
    public Loop41(){
        String oct="1101010111001111";
        String temp="";
        int i=oct.length(),reminder;
        if(i%4==0){
            //
        }
        else{
            reminder=i%4;
            reminder=4-reminder;
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
            bin=oct.substring(i-4,i);
            i=i-4;
            for(int x=bin.length(),y=0;x>0;x--,y++){
                temp=bin.substring(x-1,x);
                pow=1;
                for(int c=0;c<y;c++)
                {
                    pow=pow*2;
                }
                sum=sum+(Integer.parseInt(temp)*pow);
            }
            if(sum>9){
                if(sum==10){
                    binary="A"+binary;
                }
                else if(sum==11){
                    binary="B"+binary;
                }
                else if(sum==12){
                    binary="C"+binary;
                }
                else if(sum==13){
                    binary="D"+binary;
                }
                else if(sum==14){
                    binary="E"+binary;
                }
                else if(sum==15){
                    binary="F"+binary;
                }
            }
            else{
               binary=sum+binary; 
            }
            //System.out.println(sum);
        }
        System.out.println(binary);
    }
    public static void main(String[] args){
        Loop41 lp=new Loop41();
    }
}