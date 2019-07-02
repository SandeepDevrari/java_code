package javaCollection;
import java.util.HashSet;
import java.util.Iterator;
public class JavaHashSet_Example1{
	public JavaHashSet_Example1(){
		HashSet<String> set=new HashSet<>();
		System.out.println(set.isEmpty());
        set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add(null);
		System.out.println(set);
		System.out.println("is remove: "+set.remove(null));
        System.out.println(set.size());
        //iterator
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		Object[] str=set.toArray();
        System.out.println(str[0]);
        System.out.println("contains 'abc' : "+set.contains("abc"));
	}
	public static void main(String[] args){
		new JavaHashSet_Example1();
	}
}
