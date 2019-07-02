import java.util.Scanner;
class Override_Hotel
{
    String hotelnm;
    int hotelchrg;
    Scanner sc=new Scanner(System.in);
    void get()
    {
        //sc=new Scanner(System.in);
        System.out.print("Enter Hotel Name: ");
        hotelnm=sc.next();
        System.out.print("Enter Hotel Charges: ");
        hotelchrg=sc.nextInt();
    }
    /*void show(Override_Hotel H,Override_Hotel C)
    {
        
    }*/
}
class Override_Customer extends Override_Hotel
{
    String custnm;
    int cust_noOfDays;
    void get()
    {
        //Scanner sc=new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        custnm=sc.next();
        System.out.print("Enter Total Days: ");
        cust_noOfDays=sc.nextInt();
    }
}
class Override_Billing extends Override_Customer
{
    String billno;
    int amount;
    void get()
    {
        //Scanner sc=new Scanner(System.in);
        System.out.print("Enter Bill Number: ");
        billno=sc.next();
    }
    /*void show(String hnm,int hcrg,String cnm,int nd,String bno)
    {
        //amount=hcrg*C.cust_noOfDays;
        System.out.println("\n\t\t\t\tTotal Amount");
        System.out.println("\t\t\tHotel Name: "+hnm+"\n\t\t\tHotel Charges: "+hcrg);
        System.out.println("\t\t\tCustomer Name: "+cnm+"\n\t\t\tTotal Days: "+nd);
        System.out.println("\t\t\tBill NO.: "+bno+"Total Amount: "+(hcrg*nd));
    }*/
    void show(Override_Hotel H,Override_Customer C) 
    {
        //Override_Hotel H=new Override_Hotel();
        //Override_Customer C=new Override_Customer();
        amount=H.hotelchrg*C.cust_noOfDays;
        System.out.println("\n\t\t\t\tTotal Amount");
        System.out.println("\t\t\tHotel Name\t\t:"+H.hotelnm+"\n\t\t\tHotel Charges\t\t:"+H.hotelchrg);
        System.out.println("\t\t\tCustomer Name\t\t:"+C.custnm+"\n\t\t\tTotal Days\t\t:"+C.cust_noOfDays);
        System.out.println("\t\t\tBill NO.\t\t:"+billno+"\n\t\t\tTotal Amount\t\t:"+amount);
    }
    public static void main(String args[])
    {
        /*Override_Hotel oh=new Override_Hotel();
        oh.get();
        Override_Customer oc=new Override_Customer();
        oc.get();
        Override_Billing ob=new Override_Billing();
        ob.get();
        //Override_Billing OB=new Override_Billing();
        ob.show(oh,oc);*/
        
        
        Override_Hotel oh=new Override_Hotel();
        oh.get();
        Override_Customer oc=new Override_Customer();
        oc.get();
        Override_Billing ob=new Override_Billing();
        ob.get();
        //Override_Billing Ob=new Override_Billing();
        ob.show(oh,oc);
        //Ob.show(oh.hotelnm,oh.hotelchrg,oc.custnm,oc.cust_noOfDays,Ob.billno);
        //Ob.show();
        //Override_Billing bill=new Override_Billing();
        //bill.get();
        //bill.show();
    }
}