public class Reverse_String_Loop{
    public Reverse_String_Loop(String str){
        String j="";
        char[] c=str.toCharArray();
        for(char v:c){
            j=v+j;
        }
        System.out.println(j);
    }
    public static void main(String[] args){
        Reverse_String_Loop rsl=new Reverse_String_Loop("sandeep");
    }
}