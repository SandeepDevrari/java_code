public class String_Builder1{
    String_Builder1(){
        StringBuilder s=new StringBuilder("hello");
        System.out.println(s);
        s.append("you");
        System.out.println(s);
        s.append(true);
        System.out.println(s);
        System.out.println(s.reverse());
        s.reverse();
        s.insert(0,"Builder");
        System.out.println(s);
        s.replace(1,3,"123");
        System.out.println(s);
        s.delete(1,5);
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.charAt(5));
        System.out.println(s.codePointAt(5));
        System.out.println(s.deleteCharAt(5));
        System.out.println(s.indexOf("you"));
        System.out.println(s.lastIndexOf("you"));
        System.out.println(s.length());
        s.setCharAt(4,'U');
        System.out.println(s);
        System.out.println(s.substring(3));
    }
    public static void main(String[] args){
        String_Builder1 sb=new String_Builder1();
    }
}