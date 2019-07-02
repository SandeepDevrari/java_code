import java.io.*;
class ExceptionTestingArray
{
    InputStreamReader isr;
    BufferedReader br;
    float arry1[],arry2[],arry3[];
    int sz;
    void input() throws IOException
    {
        try
        {
        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        System.out.print("Enter Size: ");
        sz=Integer.parseInt(br.readLine());
        arry1=new float[sz];
        arry2=new float[sz];
        arry3=new float[sz];
        System.out.println("\nEnter Numbers in Array1:");
        for(int i=0;i<sz;i++)
        {
            arry1[i]=Float.parseFloat(br.readLine());
        }
        System.out.println("\nEnter Numbers in Array2:");
        for(int i=0;i<sz;i++)
        {
            arry2[i]=Float.parseFloat(br.readLine());
        }
        }
        catch(NegativeArraySizeException nase)
        {
            System.out.println("Please check array  size ");
        }
        catch(NumberFormatException nfe)
        {
            System.out.println(nfe.getMessage());
        }
    }
    void output() throws IOException
    {
        try
        {
        System.out.print("\nAfter Division of Array1 & Array2: ");
        for(int i=0;i<sz;i++)
        {
            arry3[i]=arry1[i]/arry2[i];
            System.out.print(arry3[i]+" ");
        }
        System.out.println(" ");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("No zeroes in second array ..... "+ae.getMessage());
        }
    }
    public static void main(String args[]) throws IOException
    {
        ExceptionTestingArray earry=new ExceptionTestingArray();
        earry.input();
        earry.output();
    }
}