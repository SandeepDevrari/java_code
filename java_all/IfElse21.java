
public class IfElse21{
    double totalBill;
    IfElse21(){
        int units=300;
        
        if(units>0)
        {
            if(units>50)
            {
                totalBill=50*0.50;
                units=units-50;
                if(units>0)
                {
                    if(units>100)
                    {
                        totalBill=totalBill+(100*0.75);
                        units=units-100;
                        if(units>0)
                        {
                            if(units>100)
                            {
                                totalBill=totalBill+(100*1.20);
                                units=units-100;
                                if(units>0)
                                {
                                    if(units>250)
                                    {
                                        totalBill=totalBill+(250*1.50);
                                        units=units-100;
                                    }
                                    else{
                                        totalBill=totalBill+units*1.50;
                                    }
                                }
                                else{
                                    //
                                }
                            }
                            else{
                                totalBill=totalBill+units*1.20;
                            }
                        }
                        else{
                            //
                        }
                    }
                    else{
                        totalBill=totalBill+units*0.75;
                    }
                }
                else{
                    //
                }
            }
        else{
            totalBill=units*0.50;
        }
            
                System.out.println("total Bill= "+totalBill);
        }
    }
    public static void main(String[] args)
    {
        IfElse21 ie=new IfElse21();
    }
}