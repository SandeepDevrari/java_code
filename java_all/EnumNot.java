import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.Console;

public class EnumNot{
    private String cardnm;
    private String[] cardarr={"^4[0-9]{12}(?:[0-9]{3})?$","^5[1-5][0-9]{14}$","^(5018|5020|5038|6304|6759|6761|6763)[0-9]{8,15}$","^6[0-9]{15}$"};
    Console con;
    
    public EnumNot()
    {
        con=System.console();
        char st='0';
        this.cardnm=con.readLine("Enter Credit Card Number");
        for(int i=0;i<cardarr.length;i++)
        {
            Pattern pat=Pattern.compile(cardarr[i]);
            Matcher mat=pat.matcher(cardnm);
            if(mat.find())
            {
                if(i==0)
                    st='V';
                else if(i==1)
                    st='M';
                else if(i==2)
                    st='S';
                else
                    st='R';
                break;
            }
        }
        if(st=='V')
        {
            con.format("%s is VISA Card%n",cardnm);
        }
        else if(st=='M')
        {
            con.format("%s is MASTER Card%n",cardnm);
        }
        else if(st=='S')
        {
            con.format("%s is MAESTRO Card%n",cardnm);
        }
        else if(st=='R')
        {
            con.format("%s is RUPAY Card%n",cardnm);
        }
        else
        {
            con.format("%s is not a valid Card%n",cardnm);
        }
    }

    public static void main(String[] args)
    {
        EnumNot obj=new EnumNot();
    }
    
}