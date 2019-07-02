class A1
{
    void Msg1()
    {
        System.out.println("Hello Buddy !!! ");
    }
}
class A2
{
    void Msg2()
    {
        System.out.println("Hello Friends !!! ");
    }
}

class A3
{
    void Msg3()
    {
        System.out.println("Good Day !! ");
    }
    public static void main(String m[])
    {
        A1 a1=new A1();
        A2 a2=new A2();
        A3 a3=new A3();
        a1.Msg1();
        a2.Msg2();
        a3.Msg3();
    }
}
