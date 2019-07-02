public class IfElse14{
    IfElse14(){
        int x=20,y=30,z=50;
        
        int total=x+y+z;
        if(total<180){
            System.out.println("Not valid");
        }
        else if(total>180)
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
        IfElse14 ie=new IfElse14();
    }
}