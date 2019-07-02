class Static_check
{
    static int v;//default 0
    int y;//default 0
    public static void main(String arggs[])
    {
        Static_check obj1=new Static_check();
        Static_check obj2=new Static_check();
        //obj2.v=1;
        obj1.v=2;
        //obj2.y=2;
        //obj1.y=4;
        //System.out.println(obj1.v);
        System.out.println(Static_check.v);
        //System.out.println(obj2.y);
    }
}