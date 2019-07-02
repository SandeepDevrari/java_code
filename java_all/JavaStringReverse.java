import java.io.*;
import java.util.*;

public class JavaStringReverse{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        //for(int i=0,j=A.length()-1;i<A.length()/2,j>A.length()/2;i++,j++){}
        char[] Arr=A.toCharArray();
        String temp="";
        for(char c:Arr){
            temp=c+temp;
        }
        if(temp.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}