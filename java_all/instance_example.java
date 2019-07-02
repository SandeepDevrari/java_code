class Instance_A
{
    static void output()
    {
        System.out.println("A");
    }
}
class Instance_B extends Instance_A
{
    static void output()
    {
        System.out.println("B");
    }
    public static void main(String args[])
    {
        Instance_A a=new Instance_B();
        a.output();
    }
}