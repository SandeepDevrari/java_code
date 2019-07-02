public class IfElse5{
    IfElse5(int i){
        if(i%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args)
    {
        IfElse5 ie=new IfElse5(23);
    }
}