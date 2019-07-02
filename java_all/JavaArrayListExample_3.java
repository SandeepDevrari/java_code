package javaCollection;
//it will never throw ConcurrentModificationException in  multi-thread
//because of synchronized environment
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
public class JavaArrayListExample_3{
	static List<String> arryList;
	public JavaArrayListExample_3(){
		arryList=Collections.synchronizedList(new ArrayList<>());
		
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
			synchronized(arryList){
				System.out.println("Thread 1");
				System.out.println("removing element- "+arryList.remove(0));
			}
		}
	}
	public static class InternalClass_2 implements Runnable{
		@Override
		public void run(){
		synchronized(arryList){
				System.out.println("Thread 2");
				for(String s:arryList){
					System.out.println(s);
				}
			}
		}
	}
	public static void main(String[] args){
		JavaArrayListExample_3 jal=new JavaArrayListExample_3();
		Thread t1=new Thread(new InternalClass_1());
		Thread t2=new Thread(new InternalClass_2());
		t1.start();
		t2.start();
	}
}
