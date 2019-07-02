public class IfElse7{
    IfElse7(int i){
        if(i>=65 && i<=91 || i>=97 && i<=123)
        {
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not Alphabet");
        }
    }
    public static void main(String[] args)
    {
        IfElse7 ie=new IfElse7('z');
    }
}