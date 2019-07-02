class Share
{
    void table(int x,int y)
    {
        int c=1;
        for(int i=1;i<=y;i++)
        {
            c=c*x;
        }    
        System.out.println(x+"^"+y+"="+c);
    }
}
class Menu1
{
    public static void main(String args[])
    {
        int x,y;
        if(args.length>0)
       {
            x=Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            Share obj=new Share();
            obj.table(x,y);
       }
       else
       {
           System.out.println("Error!!");
       }
    }
}