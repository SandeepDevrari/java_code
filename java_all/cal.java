/*class Calculator_fun
{
    void add(float x,float y)
    {
        System.out.println("Answer: "+(x+y));
    }
    void sub(float x,float y)
    {
        System.out.println("Answer: "+(x-y));
    }
    void multi(float x,float y)
    {
        System.out.println("Answer: "+(x*y));
    }
    void div(float x,float y)
    {
        if(y!=0)
        {
            System.out.println("Answer: "+(x/y));
        }
        else
        {
            System.out.println("Error!!");
        }
    }
}*/
class Calculator
{
    public static void main(String args[])
    {
       int x,y;
       if(args.length>0)
       {
            //System.out.println(args.length);
            x=Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            System.out.println("Sum: "+(x+y));
            System.out.println("Subtract: "+(x-y));
            System.out.println("Multi: "+(x*y));
            System.out.println("Divide: "+(x/y));
       }
       else
       {
           System.out.println("Error!!");
       }
    }
}