package hackerrank;
//import java.util.Scanner;
//import java.util.HashMap;
import java.util.*;
@SuppressWarnings("unchecked")
public class JavaStringAnagram{
	static boolean isAnagram(String a,String b){
		if(a.length()!=b.length()){
			return false;
		}
		HashMap<Character,Integer> listTemp1=setList(a.toLowerCase());
		HashMap<Character,Integer> listTemp2=setList(b.toLowerCase());
		for(Map.Entry e:listTemp1.entrySet()){
			if(!listTemp2.containsKey(e.getKey())){
				return false;
			}
			if(listTemp2.get(e.getKey())!=e.getValue()){
				return false;
			}
			
		}
		
		return true;
	}
	static HashMap setList(String str){
		char[] strArry=str.toCharArray();
		HashMap<Character,Integer> listTemp=new HashMap<>();
		for(char c:strArry){
			if(!listTemp.containsKey(c)){
				listTemp.put(c,1);
			}
			else{
				//int i=listTemp.get(c);
				listTemp.replace(c,(listTemp.get(c)+1));
			}
		}
		return listTemp;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		scan.close();
		boolean ret=isAnagram(a,b);
		System.out.println((ret)?"Anagram":"Not Anagram");
	}
}
