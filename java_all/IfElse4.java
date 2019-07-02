public class IfElse4{
    IfElse4(int i){
        if(i%5==0)
        {
            System.out.println("Divide by 5");
        }
        else if(i%11==0){
            System.out.println("Divide by 11");
        }
        else{
            System.out.println("Not divide by both 5 and 11");
        }
    }
    public static void main(String[] args)
    {
        IfElse4 ie=new IfElse4(22);
    }
}