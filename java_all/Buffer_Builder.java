public class Buffer_Builder{
    Buffer_Builder(){
        StringBuffer str=new StringBuffer("Hello");
        StringBuilder str1=new StringBuilder("Hello");
        StringBuffer str2=new StringBuffer("Hello");
        StringBuilder str3=new StringBuilder("Hello");
        System.out.println("str3==str1: "+(str3==str1));
        System.out.println("str==str2: "+(str==str2));
        //System.out.println("str2==str3: "+(str2==str3));
    }
    public static void main(String[] args){
        Buffer_Builder bb=new Buffer_Builder();
    }
}