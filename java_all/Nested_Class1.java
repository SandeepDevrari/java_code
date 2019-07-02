public class Nested_Class1{
    protected class Nested_Class1_inner{
        Nested_Class1_inner(){
            System.out.println("Inner Class");
        }
    }
    public static void main(String[] args){
        new Nested_Class1().new Nested_Class1_inner();
    }
}