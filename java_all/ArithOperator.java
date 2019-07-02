package ao;
public class ArithOperator
{
    public void addOperator(int x,int y)
    {
        System.out.println("x :"+x+"\ny: "+y);
        System.out.println("Result: "+(x+y));
    }
    public void subOperator(int x,int y)
    {
        System.out.println("x :"+x+"\ny: "+y);
        System.out.println("Result: "+(x-y));
    }
    public void multiOperator(int x,int y)
    {
        System.out.println("x :"+x+"\ny: "+y);
        System.out.println("Result: "+(x*y));
    }
    public void divOperator(int x,int y)
    {
        if(y!=0)
        {
            System.out.println("x :"+x+"\ny: "+y);
            System.out.println("Result: "+(x/y));
        }
        else
        {
            System.out.println("Error !!");
        }
    }
}