
public class IfElse9{
    IfElse9(){
        char i='&';
        if(i>=65 && i<=91 || i>=97 && i<=123)
        {
            System.out.println("Alphabet");
        }
        else if(i>=48 && i<=57){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
    public static void main(String[] args)
    {
        IfElse9 ie=new IfElse9();
    }
}