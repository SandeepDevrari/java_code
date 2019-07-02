package javaCollection;
import java.util.LinkedHashSet;
public class JavaLinkedHashSet_Example1{
	public JavaLinkedHashSet_Example1(){
		LinkedHashSet<String> set=new LinkedHashSet<>();
		set.add("abcd");
		set.add("abcd");
		set.add("abd");
		set.add("a");
		set.add(null);
		System.out.println(set);
	}
	public static void main(String[] args){
		new JavaLinkedHashSet_Example1();
	}
}
