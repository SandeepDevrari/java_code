/*
	 The following example code will either print "1 0" or "0 1." In the absence of synchronization, it could also print "1 1" (or even "0 0," believe it or not).
*/

public class JavaThreadSync_Atomic{
	private static int x,y;
	private static Object object=new Object();
	public static class JavaThreadSync_Atomic_Thread_1 implements Runnable{
		@Override
		public void run(){
			synchronized(object){
				x=y=0;
				System.out.println(x);
			}
		}
	}
	public static class JavaThreadSync_Atomic_Thread_2 implements Runnable{
		@Override
		public void run(){
			synchronized(object){
				x=y=1;
				System.out.println(y);
			}
		}
	}
	public static void main(String[] args){
		Thread t1=new Thread(new JavaThreadSync_Atomic_Thread_1());
		Thread t2=new Thread(new JavaThreadSync_Atomic_Thread_2());
		t1.start();
		t2.start();
	}
}
