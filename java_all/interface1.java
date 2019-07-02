public class Interface1 implements Interface2{
    public void draw(){
        System.out.println("1");
    }
    
    public void output(){
        System.out.println("this is output");
    }
    
    public static void main(String[] args){
        Interface1 i1=new Interface1();
        i1.draw();
        i1.output();
        Interface3.static_method();
        i1.default_method();
    }
}
interface Interface2 extends Interface3{
    public void draw();
}
interface Interface3{
    public void output();
    static void static_method(){
        System.out.println("static method");
    }
    default void default_method(){
        System.out.println("default method");
    }
}