class Test
{    
    void test()
    {
        System.out.print("Hello ");
        System.out.print("World!\n");
    }
    void t()
    {
        int n=4;
        int v=5;
        System.out.println("Checking "+ (n+v));
    }
}
class main
{
    public static void main(String args[])
    {
        Test obj=new Test();
        obj.test();
        obj.t();
    }
}