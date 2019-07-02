public class Polymorphism1 extends Polymorphism2{
    public void draw(){
        System.out.println("1");
    }
    
    public static void main(String[] args){
        Polymorphism2 p1=new Polymorphism1();
        p1.draw();
    }
}
class Polymorphism2{
    public void draw(){
        System.out.println("2");
    }
}