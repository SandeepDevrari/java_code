class ThreadSync_Account{
    int bal=5000;
    int temp;
    public synchronized void increment(String str){
        temp=bal+1000;
        System.out.println(str+" before increment"+bal);
        bal=temp;
        System.out.println(str+" after increment"+bal);
    }
    public synchronized void decrement(String str){
        temp=bal-1000;
        System.out.println(str+" before decrement"+bal);
        bal=temp;
        System.out.println(str+" after decrement"+bal);
    }
}
public class ThreadSync_Bank{
    public static void main(String[] args){
        ThreadSync_Account a=new ThreadSync_Account();
        ThreadSync_Increment i=new ThreadSync_Increment(a,"increment");
        ThreadSync_Decrement d=new ThreadSync_Decrement(a,"decrement");
        i.start();
        d.start();
    }
}
class ThreadSync_Increment extends Thread{
    ThreadSync_Account a;
    String ss;
    ThreadSync_Increment(ThreadSync_Account a,String str){
        this.a=a;
        this.ss=str;
    }
    @Override
    public void run(){
        System.out.println(ss);
        for(;;){
            a.increment(ss);
        }
    }
}
class ThreadSync_Decrement extends Thread{
    ThreadSync_Account a;
    String ss;
    ThreadSync_Decrement(ThreadSync_Account a,String str){
        this.a=a;
        this.ss=str;
    }
    @Override
    public void run(){
        System.out.println(ss);
        for(;;){
            a.decrement(ss);
        }
    }
}