import java.io.*;
class MultipleOf7
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
            //arry=new int[sz];
            System.out.println("Enter Numbers: ");
            for(int i=0;i<sz;i++)
            {
                num=Integer.parseInt(br.readLine());
                check=multipleOf7(num);
                if(check==0)
                {
                    throw new ProbWithSevenException(num);
                    //System.out.println(num+" is Multiple of 7!!!\nTotal sum: "+sum+"\nyou'r Exit@@@\n");
                    //System.exit(0);
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
        catch(ProbWithSevenException pwse)
        {
                System.out.println(pwse);
        }
        finally
        {
            isr=null;
            br=null;
        }
    }
    int multipleOf7(int num) throws IOException
    {
        if(num%7==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    void output() throws IOException
    {
        System.out.println("Completed#####\nTotal sum: "+sum+"\nyou'r Exit@@@\n");
    }
    public static void main(String args[]) throws IOException
    {
        MultipleOf7 multi=new MultipleOf7();
        try
        {
            multi.input();
            multi.output();
        }
        finally
        {
            multi=null;
        }
    }
}