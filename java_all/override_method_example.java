class Override_Top
{
    void show()
    {
        System.out.println("I'm from class Top");
    }
}
class Override_Mid extends Override_Top
{
    void show()
    {
        System.out.println("I'm from class Mid");
    }
}
class Override_Bottom extends Override_Mid
{
    void show()
    {
        System.out.println("I'm from class Bottom");
    }
    public static void main(String args[])
    {
        new Override_Top().show();
        new Override_Mid().show();
        new Override_Bottom().show();
        Override_Mid md=new Override_Mid();
        md.show();
        Override_Bottom bt=new Override_Bottom();
        bt.show();
    }
}