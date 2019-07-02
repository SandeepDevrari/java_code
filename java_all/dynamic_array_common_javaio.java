import java.io.*;
class ArrayCommonJavaIO
{
    InputStreamReader isr;
    BufferedReader br;
    int sz,i;
    int arr1[],arr2[];
    void input() throws IOException
    {
        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        System.out.print("Enter Array Size: ");
        sz=Integer.parseInt(br.readLine());
        arr1=new int[sz];
        arr2=new int[sz];
        for(i=0;i<sz;i++)
        {
            System.out.print("Enter Number in Array 1: ");
            arr1[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<sz;i++)
        {
            System.out.print("Enter Number in Array 2: ");
            arr2[i]=Integer.parseInt(br.readLine());
        }
    }
    void output() throws IOException
    {
        int total=0;
        for(i=0;i<sz;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("");
        for(i=0;i<sz;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("");
        System.out.println("Common Numbers:->");
        for(i=0;i<sz;i++)
        {
            for(int j=0;j<sz;j++)
            {
                if(arr1[i]==arr2[j])
                    System.out.print(arr1[i]+" ");
            }
        }
        System.out.println("");
    }
    public static void main(String args[]) throws IOException
    {
        ArrayCommonJavaIO addarry=new ArrayCommonJavaIO();
        addarry.input();
        addarry.output();
    }
}