package threads;
class JavaThread2_1 extends Thread{
	@Override
	public void run(){
		System.out.println("extends thread1");
	}
}
class JavaThread2_2 extends Thread{
	@Override
	public void run(){
		int g=((2*2*2*2)-3+2);
		System.out.println("extends thread2"+g);
	}
}
public class JavaThread2{
	public static void main(String[] args){
		(new JavaThread2_2()).start();
		(new JavaThread2_1()).start();
		System.out.println("will this run first");
	}
}
