public class Loop25{
    int ans=0,i=2,j=2;
    int com1=0,com2=0;
    Loop25(){
        int num1=15,num2=12;
        com1=num1;com2=num2;
        while(ans==0){
            if(com1>com2){
                com2=num2*j;
                j++;
            }
            else if(com2>com1){
                com1=num1*i;
                i++;
            }
            else{
                ans=com1;
            }
        }
        System.out.println(ans);
        
    }
    public static void main(String[] args){
        Loop25 lp=new Loop25();
    }
}