public class Encapsulation1 extends Encapsulation2{
    public static void main(String[] args){
        Encapsulation1 e1=new Encapsulation1();
        e1.setX(3);
        System.out.println(e1.getX());
    }
}
class Encapsulation2{
    private int x;
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
}