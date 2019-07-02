package javaCollection;
import java.util.ArrayList;
import java.util.Iterator;
public class JavaArrayListExample_1{
	public JavaArrayListExample_1(){
		ArrayList<String> arryList=new ArrayList<>();
		System.out.println(arryList);
		System.out.println(arryList.size());
		arryList.add("abcd");
		System.out.println(arryList);
		arryList.add(0,"bcdef");
		System.out.println(arryList);
		arryList.add("bcdef");
		System.out.println(arryList);
		arryList.remove("bcdef");
		System.out.println(arryList);
		arryList.remove(0);
		System.out.println(arryList);
		
		arryList.add("abcdefghijkl");
		arryList.add("abcdefghijk");
		arryList.add("abcdefghij");
		arryList.add("abcdefghi");
		arryList.add("abcdefgh");
		arryList.add("abcdefg");
		arryList.add("abcdef");
		arryList.add("abcde");
		arryList.add("abcd");
		
		//Iterate ArrayList
		
		//for Loop
		for(int i=0;i<arryList.size();i++){
			System.out.println(arryList.get(i));
		}
		
		//foreach Loop(advance for loop)
		for(String s:arryList){
			System.out.println(s);
		}
		
		//iterator
		Iterator iter=arryList.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		//while
		int i=0;
		while(i<arryList.size()){
			System.out.println(arryList.get(i));
			i++;
		}
		//Stream (java 8)
		//arryList.forEach()	
	}
	public static void main(String[] args){
		JavaArrayListExample_1 jal=new JavaArrayListExample_1();
	}
}
