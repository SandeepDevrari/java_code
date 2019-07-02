package hackerrank;
import java.util.Scanner;
public class JavaString_Substring_Problem2{
	public static String findSmallLarge(String s,int k){
		String smallest="";
		String largest="";
		String temp="";
		int j=0;
		for(int i=0;i<s.length()-(k-1);i++){
			j=i;
			while(j<s.length()-(k-1)){
				temp=s.substring(j,j+=k);
				if(i==0 && j==k){
					smallest=temp;
					largest=temp;
				}
				else{
					if(temp.compareTo(largest)>0){
						largest=temp;
					}
					if(temp.compareTo(smallest)<0){
						smallest=temp;
					}
				}
			}
			
		}
		return smallest+"\n"+largest;
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int k=scan.nextInt();
		scan.close();
		//findSmallLarge(str,k);
		System.out.println(findSmallLarge(str,k));
	}
}
