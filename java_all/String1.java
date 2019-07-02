public class String1{
    public String1(){
        String str="Hello";
        String str1="Hello";
        String str2=new String("Hello");
        String str3=new String("Hello");
        System.out.println("str==str1: "+(str==str1));
        System.out.println("str==str2: "+(str==str2));
        System.out.println("str2==str3: "+(str2==str3));
    }
    public static void main(String[] args){
        String1 s1=new String1();
    }
}