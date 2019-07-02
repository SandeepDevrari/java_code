
public class IfElse10{
    IfElse10(){
        char i='k';
        if(i>=65 && i<=91)
        {
            System.out.println("Upper Case");
        }
        else if(i>=97 && i<=123){
            System.out.println("Lower Case");
        }
    }
    public static void main(String[] args)
    {
        IfElse10 ie=new IfElse10();
    }
}