public class Generic_Bounded{
    public static void main(String[] args){
        GenericBounded gb=new GenericBounded();
        gb.<String>set("Sandeep");
    }
}
class GenericBounded{
    <T extends String>void set(T t){
        System.out.println("Hello,'"+t+"'");
    }
}