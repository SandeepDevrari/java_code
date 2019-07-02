class StaticFunctionCheck
{
    public int t;
    int m=99;
    
    static void output()
    {
        int y;
        System.out.println("Day");
    } 
}
class ExtendedStaticFunctionCheck extends StaticFunctionCheck
{
    
    static void output()
    {
        System.out.println("Night");
    }
    public static void main(String args[])
    {
       
       //ExtendedStaticFunctionCheck obj1=new ExtendedStaticFunctionCheck();
        //obj1.t=1;
       /*ExtendedStaticFunctionCheck.output();
        obj1.output();
        StaticFunctionCheck obj2=new StaticFunctionCheck();
        obj2.output();*/
        //ExtendedStaticFunctionCheck obj1=new StaticFunctionCheck();
        //obj1.output();
        StaticFunctionCheck sfc=new ExtendedStaticFunctionCheck();
        sfc.output();
        //System.out.println(obj1.t);
    }
}