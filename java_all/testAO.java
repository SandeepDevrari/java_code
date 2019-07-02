import ao.ArithOperator;
class TestAo
{
    public static void main(String args[])
    {
        if(args.length==3)
        {
            ArithOperator AOobj=new ArithOperator();
            if(Integer.parseInt(args[0])==1)
            {
                AOobj.addOperator(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
            }
            else if(Integer.parseInt(args[0])==2)
            {
                AOobj.subOperator(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
            }
            else if(Integer.parseInt(args[0])==3)
            {
                AOobj.multiOperator(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
            }
            else if(Integer.parseInt(args[0])==4)
            {
                AOobj.divOperator(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
            }
            else
            {
                System.out.println("Wrong Choice!!");
            }
        }
        else
        {
            System.out.println("No Arguments!! Length of Arguments Must be 3");
        }
    }
}