package hackerrank;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class JavaRegexProblem1{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String IP=in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
	}
}
class MyRegex{
    String pattern;
    MyRegex(){
    	//pattern="^((?:[0-1])([0-9]??[0-9]??)|(?:[2])((?:[0-4])([0-9])??|(?:[5])([0-5])??)|(?:[2-9])([0-9]??))$";
    	pattern="^(((?:[0-1])([0-9]??[0-9]??)|(?:[2])((?:[0-4])([0-9])??|(?:[5])([0-5])??)|(?:[2-9])([0-9]??))[.]{1}){3}((?:[0-1])([0-9]??[0-9]??)|(?:[2])((?:[0-4])([0-9])??|(?:[5])([0-5])??)|(?:[2-9])([0-9]??))$";
    	//pattern="^(([0-2][0-5]??[0-5]??)|([0-9][0-9]??))$";//[.]{1}){3}([0-2][0-5]??[0-5]??)$";
        //pattern="^([0-9]{1,3}[.]{1})([0-9]{1,3}[.]{1})([0-9]{1,3}[.]{1})([0-9]{1,3})$";//[.][0-255][.][0-255][.][0-255]";
    }
}
