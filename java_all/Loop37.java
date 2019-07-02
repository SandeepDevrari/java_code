public class Loop37{
    public Loop37(){
        int i,rev=0;
        int n=10111;
        while(n>0){
            i=n%10;
            rev=(rev*10)+i;
            n=n/10;
        }
        while(rev>0){
            i=rev%10;
            if(i==0){
                System.out.print("1");
            }
            else if(i==1){
                System.out.print("0");
            }
            rev=rev/10;
        }
    }
    public static void main(String[] args){
        Loop37 lp=new Loop37();
    }
}