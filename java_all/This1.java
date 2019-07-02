public class This1 extends This2{
    int x,y;
    This1(){
        this(4,5);
        System.out.println("This is 1st");
        
    }
    This1(int x,int y){
        //super();
        this.x=x;
        this.y=y;
        output();
        
        //super.output();
    }
    void output(){
        System.out.println("This is 3rd");
        System.out.println(x+" "+y);
    }
    public static void main(String[] args){
        This1 t1=new This1();
    }
}
class This2{
    This2(){
        System.out.println("constructor of Base Class");
    }
   void output(){
        System.out.println("This is 2nd");
    }
}