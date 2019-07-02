public class Loop36{
    public Loop36(){
        int n=20;
        int pre=0,nxt=0,sum=0;
        while(n>1){
            sum=pre+nxt;
            System.out.print(sum+" ");
            if(nxt==0){
                nxt=1;
                System.out.print(nxt+" ");
            }
            else{
                pre=nxt;
                nxt=sum;
            }
            n--;
        }
    }
    public static void main(String[] args){
        Loop36 lp=new Loop36();
    }
}