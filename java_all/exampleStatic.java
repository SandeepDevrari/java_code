class StaticClass
{
    static int num1;
    float num2;
    static void output()
    {
       
        System.out.println(num1);
        System.out.println(num2);
    }
    public static void main(String args[])
    {
        StaticClass sc=new StaticClass();  //Correct
        //sc.output();  Correct
        StaticClass.output(); //Alternative way of calling static methods 
        System.out.println(StaticClass.num1++);
        System.out.println(StaticClass.num1);
        num1=0;
        System.out.println(sc.num1);
        System.out.println(sc.num2++);
        System.out.println(sc.num2);
        sc.num2=0;
        System.out.println(sc.num2);
    }
}