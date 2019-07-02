import java.io.*;
class ProblemPrime
{
    InputStreamReader isr;
    BufferedReader br;
    int sz,sum;
    void input() throws IOException
    {
        try
        {
            isr=new InputStreamReader(System.in);
            br=new BufferedReader(isr);
            int num=0,check=0;
            System.out.print("Enter Size: ");
            sz=Integer.parseInt(br.readLine());
            System.out.println("Enter Numbers: ");
            for(int i=0;i<sz;i++)
            {
                num=Integer.parseInt(br.readLine());
                check=prime(num);
                if(check==1)
                {
                    throw new PrimeNumberException(num);
                }
                else
                {
                    sum+=num;
                }
            }
        }
        catch(NumberFormatException n)
        {
            System.out.println("$$$Error$$$ "+n.getMessage());
        }
        catch(PrimeNumberException pne)
        {
                System.out.println(pne);
        }
        finally
        {
            isr=null;
            br=null;
        }
    }
    int prime(int num) throws IOException
    {
        for(int i=2;i<=num;i++)
        {
            if(num%i==0 && i!=num)
            {
                return 0;
            }
            else if(i==num)
            {
                return 1;
            }
        }
        return 1;
    }
    void output() throws IOException
    {
        System.out.println("Completed#####\nTotal sum: "+sum+"\nyou'r Exit@@@\n");
    }
    public static void main(String args[]) throws IOException
    {
        ProblemPrime pp=new ProblemPrime();
        try
        {
            pp.input();
            pp.output();
        }
        finally
        {
            pp=null;
        }
    }
}