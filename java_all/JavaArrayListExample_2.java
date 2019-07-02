package javaCollection;
//it will throw ConcurrentModificationException because of multi-thread
//not synchronized environment
import java.util.ArrayList;
import java.util.Iterator;
public class JavaArrayListExample_2{
	static ArrayList<String> arryList;
	public JavaArrayListExample_2(){
		arryList=new ArrayList<>();
		
		arryList.add("abcdefghijkl");
		arryList.add("abcdefghijk");
		arryList.add("abcdefghij");
		arryList.add("abcdefghi");
		arryList.add("abcdefgh");
		arryList.add("abcdefg");
		arryList.add("abcdef");
		arryList.add("abcde");
		arryList.add("abcd");
	}
	public static class InternalClass_1 implements Runnable{
		@Override
		public void run(){
			System.out.println("Thread 1");
			arryList.remove(0);
		}
	}
	public static class InternalClass_2 implements Runnable{
		@Override
		public void run(){
			System.out.println("Thread 2");
			for(String s:arryList){
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args){
		JavaArrayListExample_2 jal=new JavaArrayListExample_2();
		Thread t1=new Thread(new InternalClass_1());
		Thread t2=new Thread(new InternalClass_2());
		t1.start();
		t2.start();
	}
}
