class Protected_Access_Class
{
    protected void output()
    {
        System.out.println("I'm form Base class");
    }
}
class Protected_Access_Child extends Protected_Access_Class
{
    public void output()
    {
        System.out.println("I'm form Child class");
    }
    public static void main(String args[])
    {
        Protected_Access_Child cc=new Protected_Access_Child();
        cc.output();
        cc.output();
        //Protected_Access_Class base=new Protected_Access_Class();
        //base.output();
        //base=new Protected_Access_Child();
        //base.output();
    }
}