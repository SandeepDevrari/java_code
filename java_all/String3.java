public class String3{
    
    public String3(){
        String str="hello";
        int i=2;
        System.out.println(charAt(str,i));
        System.out.println(equals(str,"hello"));
        String s="Z";
        System.out.println(s.hashCode());
        System.out.println(length("ABCDEF"));
        System.out.println(toUpperCase("abcD"));
        System.out.println(toLowerCase("ABCD"));
        System.out.println(compareTo(str,"Hello"));
        System.out.println(concat("Hello","World!!"));
        System.out.println(contains("Hello",'o'));
        System.out.println(isEmpty("Hello"));
        System.out.println(join('*',"Hello","world","!!!"));
        System.out.println(replace("HelloNworld",'N',"*"));
        System.out.println(substring("Hello world",2,5));
        System.out.println(valueOf(5.98));
        System.out.println(codePointAt("Hello world",2));
        System.out.println(endsWith("Hello world",'d'));
        System.out.println(indexOf("Hello world",'d'));
        System.out.println(trim(" Hello ")+"ABCD");
    }
    String charAt(String s,int i){
        return (s.substring(i-1,i));
    }
    boolean equals(String a,String b){
        int i=a.hashCode();
        int j=b.hashCode();
        if(i==j){
            return true;
        }
        return false;
    }
    int length(String s){
        int i=0;
        char[] c=s.toCharArray();
        for(char v:c){
            i++;
        }
        return i;
    }
    String toUpperCase(String s){
        char[] c=s.toCharArray();
        String p="";
        for(char v:c){
            if(v>90)
                p=p+(char)(v-32);
            else{
                p=p+v;
            }
        }
        return p;
    }
    String toLowerCase(String s){
        char[] c=s.toCharArray();
        String p="";
        for(char v:c){
            if(v<90)
                p=p+(char)(v+32);
            else{
                p=p+v;
            }
        }
        return p;
    }
    boolean compareTo(String a,String b){
        int i=a.hashCode();
        int j=b.hashCode();
        if(i==j){
            return true;
        }
        return false;
    }
    String concat(String s,String t){
        return (s+t);
    }
    boolean contains(String s,char p){
        char[] c=s.toCharArray();
        for(char v:c){
            if(v==p){
                return true;
            }
        }
        return false;
    }
    boolean isEmpty(String s){
        if(s==null)
            return true;
        return false;
    }
    String join(char y,String...s){
        String b="";
        for(String p:s){
            b=b+y+p;
        }
        return b;
    }
    String replace(String s,char y,String p){
        char[] t=s.toCharArray();
        String h="";
        for(char e:t){
            if(e==y)
                h=h+p;
            else{
                h=h+e;
            }
        }
        return h;
    }
    String substring(String s,int i,int j){
        char[] t=s.toCharArray();
        String h="";
        for(int g=i;g<=j;g++){
            h=h+t[g];
        }
        return h;
    }
    String valueOf(int a){
        return (""+a);
    }
    String valueOf(float a){
        return (""+a);
    }
    String valueOf(char a){
        return (""+a);
    }
    String valueOf(double a){
        return (""+a);
    }
    String valueOf(long a){
        return (""+a);
    }
    String valueOf(short a){
        return (""+a);
    }
    int codePointAt(String s,int a){
        char[] f=s.toCharArray();
        return ((int)(f[a]));
    }
    boolean endsWith(String s,char c){
        char[] f=s.toCharArray();
        int l=f.length;
        if(f[l-1]==c)
            return true;
        return false;
    }
    int indexOf(String s,char o){
        int y=0;
        char[] f=s.toCharArray();
        for(char t:f){
            if(t==o)
                return y;
            y++;
        }
        return 0;
    }
    String trim(String s){
        String j="";
        char[] f=s.toCharArray();
        for(char t:f){
            if(t==' '){
                //
            }
            else{
                j=j+t;
            }
        }
        return j;
    }
    public static void main(String[] args){
        String3 s3=new String3();
    }
}