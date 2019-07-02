package threads;
public class JavaThreadGroup implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args){
        JavaThreadGroup jg=new JavaThreadGroup();
        ThreadGroup tg=new ThreadGroup("group 1");
        Thread t1=new Thread(tg,jg,"1");
        Thread t2=new Thread(tg,jg,"2");
        Thread t3=new Thread(tg,jg,"3");
        Thread t4=new Thread(tg,jg,"4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try{
            tg.sleep(2_000);
        }catch(InterruptedException){
            System.out.println("abc");
        }
        System.out.println(tg.getName());
        tg.list();
    }
}