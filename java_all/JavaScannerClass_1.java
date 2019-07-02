import java.util.Scanner;  
public class JavaScannerClass_1{  
    public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);  
        
        System.out.println("Integer");  
        int inte=sc.nextInt();  
        System.out.println("String");  
        String str=sc.next();  
        System.out.println("Double");  
        double dob=sc.nextDouble();  
        System.out.println("integer:"+inte+" String:"+str+" Double:"+dob);  
        sc.close();
    }  
}   