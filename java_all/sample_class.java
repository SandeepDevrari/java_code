class Sample
{
    String num1;
    char num2;
    int num3;
    float num4;
    boolean num5;
    double num6;
    long num7;
    short num8;
    void show()
    {
        //int num1;
        System.out.println("String Value is "+num1);
        System.out.println("Char Value is "+num2);
        System.out.println("Int Value is "+num3);
        System.out.println("Float Value is "+num4);
        System.out.println("Boolean Value is "+num5);
        System.out.println("Double Value is "+num6);
        System.out.println("Long Value is "+num7);
        System.out.println("Short Value is "+num8);
        //num1=2;
        //System.out.println("Value is "+num1);
    }
    public static void main(String args[])
    {
        Sample smp=new Sample();
        smp.show();
    }
}