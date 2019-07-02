public class Loop24{
    Loop24(){
        int num1=300,num2=158;
        int temp1=0,temp2=0;
        if(num1>num2){
            while(num2>0){
                temp1=num1%num2;
                if(temp1==0)
                    break;
                temp2=num2;
                num2=temp1;
                num1=temp2;
                //System.out.println(num2);
            }
            System.out.println(num2);
        }else if(num1<num2){
            while(num1>0){
                temp1=num2%num1;
                if(temp1==0)
                    break;
                temp2=num1;
                num1=temp1;
                num2=temp2;
                //System.out.println(num1);
            }
            System.out.println(num1);
        }
        
    }
    public static void main(String[] args){
        Loop24 lp=new Loop24();
    }
}