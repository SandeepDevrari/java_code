public class String2{
    public String2(){
        String str="Hello";
        String str1="World";
        String str3="Good to see you";
        System.out.println("str.toUpperCase():"+str.toUpperCase());
        System.out.println("str.toLowerCase():"+str.toLowerCase());
        System.out.println("str.charAt(3):"+str.charAt(3));
        System.out.println("str.compareTo(str1):"+str.compareTo(str1));
        System.out.println("str.concat(str1):"+str.concat(str1));
        System.out.println("str3.contains(see):"+str3.contains("see"));
        System.out.println("str3.endsWith(you):"+str3.endsWith("you"));
        System.out.println("str.equals(str1):"+str.equals(str1));
        System.out.println(String.format("x value :%d",10));
        System.out.println("str3.indexOf(to):"+str3.indexOf("to"));
        System.out.println("str3.length():"+str3.length());
        System.out.println("str3.isEmpty():"+str3.isEmpty());
        System.out.println("String.join($,hello,@,you):"+String.join("$","hello","@","you"));
        System.out.println("str3.lastIndexOf('o'):"+str3.lastIndexOf('o'));
        System.out.println("str3.replace('o','@'):"+str3.replace('o','@'));
        System.out.println("str3.replaceAll('you','me'):"+str3.replaceAll("you","me"));
        //System.out.println("str3.split('\\s'):"+str3.split("\\s"));
        
        System.out.println("str3.startsWith('Good'):"+str3.startsWith("Good"));
        System.out.println("str3.substring(4):"+str3.substring(4));
        System.out.println("String.valueOf(4.33):"+String.valueOf(4.33));
        System.out.println("str.codePointAt(3):"+str.codePointAt(3));
        System.out.println("str.codePointBefore(3):"+str.codePointBefore(3));
        System.out.println("str.codePointCount(3,5):"+str.codePointCount(3,5));
        System.out.println("str.compareToIgnoreCase(HELLO):"+str.compareToIgnoreCase("HELLO"));
        //System.out.println("str.contentEquals(H,E,L,L,O):"+str.contentEquals("H","E","L","L","O"));
        //CharSequence ch="hello";
        System.out.println("str3.trim():"+str3.trim()+"okay");
        System.out.println("str3.toString():"+str3.toString());
        char[] b=str.toCharArray();
        for(char c:b){
            System.out.println(c);
        }
        System.out.println("str3.replaceFirst():"+str3.replaceFirst("to","2"));
        System.out.println("str3.matches(to):"+str3.matches("to"));
        byte[] bc=str.getBytes();
        for(int c:bc){
            System.out.println(c);
        }
    }
    public static void main(String[] args){
        String2 s1=new String2();
    }
}