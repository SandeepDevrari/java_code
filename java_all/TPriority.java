class MyThread1 extends Thread{
  MyThread1(String s){
  super(s);
  start();
  }
  public void run(){
  for(int i=0;i<3;i++){
  Thread cur=Thread.currentThread();
  cur.setPriority(Thread.MIN_PRIORITY);
  int p=cur.getPriority();
  System.out.println("Thread Name  :"+Thread.currentThread().getName());
  System.out.println("Thread Name  :"+Thread.currentThread().getName()+" Thread Priority  :"+p);
  }
  }
}
  class MyThread2 extends Thread{
  MyThread2(String s){
  super(s);
  start();
  }

public void run(){
  for(int i=0;i<3;i++){
  Thread cur=Thread.currentThread();
  cur.setPriority(Thread.MAX_PRIORITY);
  int p=cur.getPriority();
  System.out.println("Thread Name  :"+Thread.currentThread().getName());
  System.out.println("Thread Name  :"+Thread.currentThread().getName()+" Thread Priority  :"+p);
  }
  }
}
public class TPriority{
  public static void main(String args[]){  
  MyThread1 m1=new MyThread1("thread1");
  MyThread2 m2=new MyThread2("thread2");
  }
}