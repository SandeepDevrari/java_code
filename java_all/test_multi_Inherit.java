class Bank
{
    void showDetails(String bnm,String AcNo,String AcHolder)
    {
        System.out.println("Bank Name: "+bnm);
        System.out.println("Account Number: "+AcNo);
        System.out.println("Account Holder Name: "+AcHolder);
    }
}
interface Trans
{
    void showTrans(String transtype,float amt, float amtHnd);
}
class BankTrans extends Bank implements Trans
{
    public void showTrans(String transtype,float amt, float amtHnd)
    {
        if(transtype=="D")
        {
            amtHnd=amtHnd+amt;
            System.out.println("Total Amount in Hand:"+amtHnd);
        }
        else if(transtype=="W")
        {
            amtHnd=amtHnd-amt;
            System.out.println("Total Amount in Hand:"+amtHnd);
        }
        else
        {
            System.out.println("Invalid Transaction!!");
        }
    }
    public static void main(String args[])
    {
        BankTrans obj1=new BankTrans();
        obj1.showDetails("PNB","1234567890","ABC");
        obj1.showTrans("D",4200.3f,2000.0f);
    }
}