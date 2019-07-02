package javaCollection;
import java.util.TreeSet;
public class JavaTreeSet_Example1{
	public JavaTreeSet_Example1(){
		TreeSet<Integer> set=new TreeSet<>();
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(10);
		System.out.println(set);
	}
	public static void main(String[] args){
		new JavaTreeSet_Example1();
	}
}
