class OuterClass_Nested
{
    void output()
    {
        System.out.println("I'm From Outer main class");
    }
    class InnerClass_Nested
    {
        void output()
        {
            System.out.println("I'm From Inner class");
        }
    }
    public static void main(String args[])
    {
        OuterClass_Nested ocn=new OuterClass_Nested();
        ocn.output();
        OuterClass_Nested.InnerClass_Nested icn=new OuterClass_Nested().new InnerClass_Nested();
        icn.output();
    }
}