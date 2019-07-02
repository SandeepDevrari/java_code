package threads;
class JavaThread1_1 implements Runnable{
	@Override
	public void run(){
		System.out.println("Implements runnable thread1");
	}
}
class JavaThread1_2 implements Runnable{
	@Override
	public void run(){
		int g=((2*2*2*2)-3+2);
		System.out.println("Implements runnable thread2"+g);
	}
}
public class JavaThread1{
	public static void main(String[] args){
		(new Thread(new JavaThread1_2())).start();
		(new Thread(new JavaThread1_1())).start();
		System.out.println("will this run first");
	}
}
