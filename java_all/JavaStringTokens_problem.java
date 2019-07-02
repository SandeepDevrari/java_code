package hackerrank;
import java.util.*;
public class JavaStringTokens_problem{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
    String s = (scan.nextLine()).trim();
    if(s.equals("")){
       System.out.println("0");
       return;
    }
    else if(s.length()>400000){
        return;
    }
	String[] temp=s.split("[ !,?'._@]+");
    
	System.out.println(temp.length);
	for(String st:temp){
		System.out.println(st);
	}
       scan.close();
    }
}
