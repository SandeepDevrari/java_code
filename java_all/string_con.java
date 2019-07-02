class StringCon
{
    String str1="hel",str2="llo",str3;
    void output()
    {
        str3=str1+str2;
        System.out.println(str3);
    }
    public static void main(String args[])
    {
        StringCon obj=new StringCon();
        obj.output();
    }
}