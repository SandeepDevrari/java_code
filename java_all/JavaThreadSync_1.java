package threads;
class JavaThreadSync_CounterClass{
	private int count=0;
	
	public synchronized void increment(){
		count++;
	}
	public synchronized void decrement(){
		count--;
	}
	public synchronized int value(){
		return count;
	}
}
public class JavaThreadSync_1 implements Runnable{
	private int methodNumber;
	private JavaThreadSync_CounterClass object;
	public JavaThreadSync_1(JavaThreadSync_CounterClass object,int i){
		methodNumber=i;
		this.object=object;
	}
	@Override
	public void run(){
		//JavaThreadSync_CounterClass object=new JavaThreadSync_CounterClass();
		if(methodNumber==1)
			object.increment();
			else{
				object.decrement();
			}
		System.out.println(" thread name "+Thread.currentThread().getName()+"coun t "+object.value());
	}
	public static void main(String[] args){
		JavaThreadSync_CounterClass object=new JavaThreadSync_CounterClass();
		//object.increment();
		Thread thread1=new Thread(new JavaThreadSync_1(object,1));
		thread1.start();
		Thread thread2=new Thread(new JavaThreadSync_1(object,3));
		thread2.start();
	}
}
