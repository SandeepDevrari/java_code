class Return_Reference_Class
{
    Return_Reference_Class()
    {
        System.out.println("Constructor Run");
    }
    void input()
    {
        System.out.println("Method Done");
    }
}
class Return_Reference_Main
{
    Return_Reference_Class output()
    {
        Return_Reference_Class rrc=new Return_Reference_Class();
        return rrc;
    }
    public static void main(String args[])
    {
        
    }
    
}

