public class IfElse16{
    IfElse16(){
        int x=60,y=54,z=53;
        
        if(x==y && x==z){
            System.out.println("Equilateral");
        }
        else if(x==y || x==z || y==z)
        {
            System.out.println("Isosceles");
        }
        else if(x!=y && x!=z && y!=z)
        {
            System.out.println("Scalene");
        }
    }
    public static void main(String[] args)
    {
        IfElse16 ie=new IfElse16();
    }
}