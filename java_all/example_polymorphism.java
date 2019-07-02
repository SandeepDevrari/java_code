class PolyBaseClass
{
    void poly()
    {
        System.out.println("Orignal method calling");
    }
    void poly(String str)//static polymorphism
    {//method override
        System.out.println("Override method : "+str);
    }
    public static void main(String args[])
    {
        PolyBaseClass ply=new PolyBaseClass();
        ply.poly();
        ply.poly("hell");
    }
}
/*class PolyDeriveClass extends PolyBaseClass
{
    void poly()
    {
         System.out.println("Virtual Polymorphism");
    }
    public static void main(String args[])
    {
        PolyDeriveClass ply=new PolyDeriveClass();
        ply.poly();
        //ply.poly("hell");
    }
}*/