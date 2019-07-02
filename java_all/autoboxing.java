class Boxing
{
    void autoboxing()
    {
        int x=23;
        Integer y=x;
        System.out.println("AutoBoxing\nint "+x+"\nInteger "+y);
    }
    void unboxing()
    {
        Integer y=23;
        int x=y;
        System.out.println("Unboxing\nint "+x+"\nInteger "+y);
    }
    void size()
    {
        System.out.println("\n\t\t\tInteger  "+(Integer.SIZE/8));
        System.out.println("\t\t\tFloat "+(Float.SIZE/8));
        System.out.println("\t\t\tLong "+(Long.SIZE/8));
        System.out.println("\t\t\tDouble "+(Double.SIZE/8));
        System.out.println("\t\t\tCharacter "+(Character.SIZE/8));
        System.out.println("\t\t\tShort "+(Short.SIZE/8));
        System.out.println("\t\t\tByte  "+(Byte.SIZE/8));
        //System.out.println("Boolean "+Boolean.SIZE);
    }
    void rangeValue()
    {
        System.out.print("\n\nByte ");
        range(Byte.SIZE);
        System.out.print("Integer ");
        range(Integer.SIZE);
        System.out.print("Long ");  //out of range value
        range(Long.SIZE);
        System.out.print("Short ");
        range(Short.SIZE);
        System.out.print("Double ");    //out of range value
        range(Double.SIZE);
        System.out.print("Character ");
        range(Character.SIZE);
        System.out.print("Float ");
        range(Float.SIZE);
        System.out.println("\n");
    }
    void range(long y)
    {
        long c=1,x=2;
        for(int i=1;i<=y;i++)
        {
            c=c*x;
        }    
        System.out.print("range "+c);
        System.out.println(" - "+c/2+" -> +"+c/2);
    }
}
class BoxingMain
{
    public static void main(String args[])
    {
        Boxing boxing=new Boxing();
        boxing.autoboxing();
        boxing.unboxing();
        boxing.size();
        boxing.rangeValue();
    }
}