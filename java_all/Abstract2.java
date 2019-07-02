abstract class Abstract_01{
    void abstract_1(){
        System.out.println("Non Abstract method");
    }
    abstract void input();
    abstract void output();
}
abstract class Abstract_02 extends Abstract_01{
    void input(){
        System.out.println("input method");
    }
    //abstract void output();
}
public class Abstract2 extends Abstract_02{
    void output(){
        System.out.println("output method");
    }
    public static void main(String[] args){
        new Abstract2().abstract_1();
        new Abstract2().input();
        new Abstract2().output();
    }
}