class Addition
{
    void add()
    {
        int n1=4;
        int n2=5;
        //int n3=n1+n2;
        System.out.println("Sum: "+(n1+n2));
    }
}
class Main
{
    public static void main(String args[])
    {
        Addition obj=new Addition();
        obj.add();
    }
}