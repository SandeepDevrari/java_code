public class JavaThreadSync_Handle{
    public static void main(String[] args){
        JavaThreadSync_Class jt=new JavaThreadSync_Class();
        Thread thread1=new Thread(jt);
        Thread thread2=new Thread(jt);
        thread1.start();
        thread2.start();
    }
}
class JavaThreadSync_Class implements Runnable{
    
    @Override
    public void run(){
        JavaThreadSync_Main object=new JavaThreadSync_Main();
        object.output();
        object.input();
    }
}
class JavaThreadSync_Main{
    static synchronized void output(){
        for(;;){
            System.out.println("***output"+Thread.currentThread().getName());
        }
    }
    static synchronized void input(){
        for(;;){
            System.out.println("***input"+Thread.currentThread().getName());
        }
    }
}