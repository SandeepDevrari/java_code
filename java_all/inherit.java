class Super
{
    void print()
    {
        System.out.println("From Parent Class");
    }
}
class Duper extends Super
{
    void show()
    {
        System.out.println("From Child Class");
    }
    public static void main(String args[])
    {
        Duper obj=new Duper();
        obj.show();
        obj.print();
    }
}