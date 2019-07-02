public class String_Buffer1{
    String_Buffer1(){
        StringBuffer s=new StringBuffer("hello");
        System.out.println(s);
        s.append("you");
        System.out.println(s);
        s.append(true);
        System.out.println(s);
        //s.reverse();
        System.out.println(s.reverse());
        s.replace(1,3,"123");
        System.out.println(s);
        s.delete(1,5);
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.charAt(5));
        System.out.println(s.codePointAt(5));
        System.out.println(s.deleteCharAt(5));
        System.out.println(s.indexOf("yo"));
        System.out.println(s.lastIndexOf("yo"));
        System.out.println(s.length());
        s.setCharAt(4,'U');
        System.out.println(s);
        s.trimToSize();
        System.out.println(s);
        System.out.println(s.substring(3));
        
    }
    public static void main(String[] args){
        String_Buffer1 sb=new String_Buffer1();
    }
}