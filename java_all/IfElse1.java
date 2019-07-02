public class IfElse1{
    IfElse1(int i,int j){
        if(i>j)
        {
            System.out.println("maximum: "+i);
        }
        else{
            System.out.println("maximum: "+j);
        }
    }
    public static void main(String[] args)
    {
        IfElse1 ie=new IfElse1(3,5);
    }
}