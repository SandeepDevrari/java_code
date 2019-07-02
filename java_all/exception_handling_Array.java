import java.io.*;
class ExceptionStringArray
{
    InputStreamReader isr;
    BufferedReader br;
    String arry1[],arry2[],arry3[];
    int sz;
    void input() throws IOException
    {
        try
        {
        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        System.out.print("Enter Size: ");
        sz=Integer.parseInt(br.readLine());
        arry1=new String[sz];
        arry2=new String[sz];
        arry3=new String[sz*2];
        System.out.println("\nEnter String into 1st Array");
        for(int i=0;i<sz;i++)
        {
            arry1[i]=br.readLine();
        }
        System.out.println("\nEnter String into 2nd Array:");
        for(int i=0;i<sz;i++)
        {
            arry2[i]=br.readLine();
        }
        for(int i=0,j=0;i<sz*2;i++)
        {
            if(i<sz)
                arry3[i]=arry1[i];
            else
            {
                arry3[i]=arry2[j];
                j+=1;
                
            }
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
        finally
        {
            br=null;
            isr=null;
            arry1=null;
            arry2=null;
            System.out.println("Finally executed ..... ");
        }
    }
    void output() throws IOException
    {
        try
        {
        System.out.println("\nAfter Concatinate Array1 & Array2:");
        for(int i=0;i<sz*2;i++)
        {
            System.out.print(arry3[i]+" ");
        }
        System.out.println(" ");
        }
        finally
        {
            arry3=null;
            System.out.println("Finally from output ... ");
        }
    }
    public static void main(String args[]) throws IOException
    {
        ExceptionStringArray sarry;
        try
        {
        sarry=new ExceptionStringArray();
        sarry.input();
        sarry.output();
        }
        finally
        {
            sarry=null;
            System.out.println("Done finally ..... ");
        }
    }
}