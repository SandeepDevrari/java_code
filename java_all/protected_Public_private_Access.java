class Protected_Private_Public_Base
{
    private int x=10;
    protected int y=11;
    public int z=12;
    private void output1()
    {
        System.out.println("1:\tprivate: "+x+"\n\tprotected: "+y+"\n\tpublic :"+z);
    }
    protected void output2()
    {
        System.out.println("2:\tprivate: "+x+"\n\tprotected: "+y+"\n\tpublic :"+z);
    }
    public void output3()
    {
        System.out.println("3:\tprivate: "+x+"\n\tprotected: "+y+"\n\tpublic :"+z);
    }
    /*public static void main(String args[])
    {
        Protected_Private_Public_Base pppb=new Protected_Private_Public_Base();
        pppb.output1();
        pppb.output2();
        pppb.output3();
    }*/
}
class Protected_Private_Public_Main extends Protected_Private_Public_Base
{
    //private int a=x+y+z;  //x is private
    private int a=y+z;
    void output4()
    {
        //System.out.println("4:\tprotected: "+y+"\n\tpublic :"+z);   //private: "+x+
        System.out.println("a: "+a);
    }
    /*public static void main(String args[])
    {
        Protected_Private_Public_Main pppm=new Protected_Private_Public_Main();
        //pppm.output1();   //Can't access, it is a private method
        //pppm.output2();
        //pppm.output3();
        pppm.output4();
    }*/
}
class Protected_Private_Public_Extended extends Protected_Private_Public_Main
{
    void output5()
    {
        System.out.println("5:\tprotected: "+y+"\n\tpublic :"+z);
    }
    public static void main(String args[])
    {
        Protected_Private_Public_Extended pppm=new Protected_Private_Public_Extended();
        pppm.output5();
    }
}