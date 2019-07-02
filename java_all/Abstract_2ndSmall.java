import java.util.Scanner;
public abstract class Abstract_2ndSmall
{
    private int digit;
    public void setOutput(int n)
    {
        digit=n;
        
    }
    public void getOutput()
    {
        
    }
    public void input()
    {
        int sz=0,num=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        sz=sc.nextInt();
        for(int i=0;i<sz;i++)
        {
            num=sc.nextInt();
            setOutput(num);
        }
    }
}
class Abstract_2ndSmallMain extends Abstract_2ndSmall
{
    //private int num;
    
    Abstract_2ndSmallMain asm=new Abstract_2ndSmallMain();
    
    asm.setOutput()
}