public class Loop38{
    public Loop38(){
        int i,rev=0;
        String one="",temp="";
        int n=10001;
        while(n>0){
            i=n%10;
            rev=(rev*10)+i;
            n=n/10;
        }
        while(rev>0){
            i=rev%10;
            if(i==0){
                one=one+1;
                //System.out.print("1");
            }
            else if(i==1){
                one=one+0;
                //System.out.print("0");
            }
            rev=rev/10;
        }
        int carry=1,num;
        int v=one.length();
        String two="";
        while(v>0){
            temp=one.substring(v-1,v);
            v--;
            if(carry==1){
                num=Integer.parseInt(temp)+carry;
                if(num>1){
                    two=0+two;
                    carry=1;
                }
                else{
                    two=num+two;
                    carry=0;
                }
            }
            else{
                two=temp+two;
            }
        }
        if(carry==1){
            two=1+two;
            carry=0;
        }
        System.out.print(two);
    }
    public static void main(String[] args){
        Loop38 lp=new Loop38();
    }
}