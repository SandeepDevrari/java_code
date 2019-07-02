public class IfElse3{
    IfElse3(int i){
        if(i>0)
        {
            System.out.println("Possitive");
        }
        else if(i<0){
            System.out.println("Negative");
        }
        else if(i==0){
            System.out.println("Zero");
        }
    }
    public static void main(String[] args)
    {
        IfElse3 ie=new IfElse3(-8);
    }
}