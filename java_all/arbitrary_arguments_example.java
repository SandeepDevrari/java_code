class ArbitraryArguments
{
    void output(int... arry)
    {
        System.out.println("Total Arguments");
        for(int i : arry)
        {
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        new ArbitraryArguments().output(1,2,3,4,5,6,7,8,9);
    }
}