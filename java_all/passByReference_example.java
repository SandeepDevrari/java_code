class PassByReference_call
{
    PassByReference_call()
    {
        System.out.println("Okay Got it");
    }
    void got()
    {
        System.out.println("sir");
    }
}
class PassByReference
{
    void output(PassByReference_call pbrc)
    {
        System.out.println("Okay");
        pbrc.got();
    }
    public static void main(String args[])
    {
        PassByReference_call pbrc=new PassByReference_call();
        new PassByReference().output(pbrc);
    }
}