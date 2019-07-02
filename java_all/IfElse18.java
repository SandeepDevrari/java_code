
public class IfElse18{
    float D,r1,r2;
    IfElse18(){
        float buy=600f,sell=300f;
        
        if(sell>buy)
        {
            System.out.println("Profit");
        }
        else if(sell==buy)
        {
            System.out.println("No Profit no loss");
        }
        else{
            System.out.println("Loss");
        }
    }
    public static void main(String[] args)
    {
        IfElse18 ie=new IfElse18();
    }
}