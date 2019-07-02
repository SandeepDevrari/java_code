public class Modifiers1{
    Modifiers1(){
        Modifiers2 m2=new Modifiers2();
        m2.output1();
        m2.output3();
    }
    public static void main(String[] args){
        Modifiers1 m1=new Modifiers1();
    }
}
class Modifiers2{
    protected void output1(){
        System.out.println("Protected");
    }
    private void output2(){
        System.out.println("Private");
    }
    void output3(){
        System.out.println("deafult");
    }
}