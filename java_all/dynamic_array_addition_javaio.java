import java.io.*;
class ArrayAdditionJavaIO
{
    InputStreamReader isr;
    BufferedReader br;
    int sz,i,sum;
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
        for(int j=0,k=sz-1;j<sz;j++,k--)
        {
            System.out.println(arr1[j]+"+"+arr2[k]+" : "+(arr1[j]+arr2[k]));
            sum=sum+arr1[j]+arr2[k];
        }
        System.out.println("Total Sum is: "+sum);
    }
    public static void main(String args[]) throws IOException
    {
        ArrayAdditionJavaIO addarry=new ArrayAdditionJavaIO();
        addarry.input();
        addarry.output();
    }
}