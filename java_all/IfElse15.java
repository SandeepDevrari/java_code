public class IfElse15{
    IfElse15(){
        int x=20,y=30,z=50;
        
        int total=(x*x)+(y*y);
        if(total<z*z){
            System.out.println("Not valid");
        }
        else if(total>z*z)
        {
            System.out.println("Not valid");
        }
        else
        {
            System.out.println("Valid");
        }
    }
    public static void main(String[] args)
    {
        IfElse15 ie=new IfElse15();
    }
}