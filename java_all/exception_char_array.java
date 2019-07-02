import java.io.*;
class ExceptionCharArray
{
    InputStreamReader isr;
    BufferedReader br;
    char arry1[],arry2[],arry3[];
    int sz;
    void input() throws IOException
    {
        try
        {
        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        System.out.print("Enter Size: ");
        sz=Integer.parseInt(br.readLine());
        arry1=new char[sz];
        arry2=new char[sz];
        arry3=new char[sz*2];
        System.out.println("\nEnter String into 1st Array");
        for(int i=0;i<sz;i++)
        {
            arry1[i]=(char)br.read();
        }
        System.out.println("\nEnter String into 2nd Array:");
        for(int i=0;i<sz;i++)
        {
            arry2[i]=(char)br.read();
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
    }
    void output() throws IOException
    {
        System.out.println("\nAfter Concatinate Array1 & Array2:");
        for(int i=0;i<sz*2;i++)
        {
            System.out.print(arry3[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String args[]) throws IOException
    {
        ExceptionCharArray carry=new ExceptionCharArray();
        carry.input();
        carry.output();
    }
}