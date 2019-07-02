class One{
    void output(){
        System.out.println("One");
    }
}
public class Inheritance2 extends One{
    void output2(){
        System.out.println("Main Class");
    }
    public static void main(String[] args){
        Inheritance2 in=new Inheritance2();
        in.output();
        in.output2();
        Two.output3();
    }
}
class Two{
    static void output3(){
        System.out.println("Two");
    }
}