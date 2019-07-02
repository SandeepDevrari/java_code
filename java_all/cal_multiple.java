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
       int x,y=0;
       if(args.length>0)
       {
           for(int i=0;i<args.length;i++)
           {   
            x=Integer.parseInt(args[i]);
            y=y+x;
           }
           System.out.println("Sum of values is "+y);
       }
       else
       {
           System.out.println("Error!!");
       }
    }
}