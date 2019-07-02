abstract class Abstract_class{
    abstract void output();
}
public class Abstract1 extends Abstract_class{
    void output(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        Abstract1 a1=new Abstract1();
        a1.output();
    }
}