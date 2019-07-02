//class Interface3_1{
//    void output(){
//        System.out.println("from Interface3_1");
//    }
//}
interface Interface3_2{
    default void output(){
        System.out.println("from Interface3_2");
    }
}
interface Interface3_3{
    default void output(){
        System.out.println("from Interface3_3");
    }
}
interface Interface3_4{
    default void output(){
        System.out.println("from Interface3_4");
    }
}// extends Interface3_1
public class Interface3 implements Interface3_2,Interface3_3,Interface3_4{
    public static void main(String[] args){
        Interface3 i3=new Interface3();
        //i3.output();
    }
}