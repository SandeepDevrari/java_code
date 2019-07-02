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
            x=Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            Calculator cc=new Calculator();
            cc.FindBig(x,y);
           
       }
       else
       {
           System.out.println("Error!!");
       }
    }
    void FindBig(int m,int n)
    {
        if(m>n)
            System.out.println(m+ " is greater than "+n);
        else if(n>m)
            System.out.println(n+ " is greater than "+m);
        else
            System.out.println(m+ " is equal to "+n);
    }
}