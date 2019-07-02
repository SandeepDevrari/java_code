public class IfElse6{
    IfElse6(int i){
        if(i%4==0)
        {
            if(i%100==0){
                if(i%400==0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not leap year");
                }
            }
            else{
                System.out.println("leap year");
            }
        }
        else{
            System.out.println("Not leap year");
        }
    }
    public static void main(String[] args)
    {
        IfElse6 ie=new IfElse6(2016);
    }
}