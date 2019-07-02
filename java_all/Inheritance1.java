class One{
    void output(){
        System.out.println("One");
    }
}
public class Inheritance1 extends Two{
    void output2(){
        System.out.println("Main Class");
    }
    public static void main(String[] args){
        Inheritance1 in=new Inheritance1();
        in.output();
        in.output2();
        in.output3();
    }
}
class Two extends One{
    void output3(){
        System.out.println("Two");
    }
}