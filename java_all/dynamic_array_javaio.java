import java.io.*;
class DynamicArrayJavaIO
{
    InputStreamReader isr;
    BufferedReader br;
    int sz,i,sume,sumo;
    int arr[];
    void input() throws IOException
    {
        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        System.out.print("Enter Array Size: ");
        sz=Integer.parseInt(br.readLine());
        arr=new int[sz];
        for(i=0;i<sz;i++)
        {
            System.out.print("Enter Number: ");
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]%2==0)
                sume=sume+arr[i];
            else
                sumo=sumo+arr[i];
        }
    }
    void output() throws IOException
    {
        int total=0;
        for(i=0;i<sz;i++)
        {
            System.out.print(arr[i]+" ");
            total=total+arr[i];
        }
        System.out.println("");
        System.out.println("Even Sum is: "+sume);
        System.out.println("Odd Sum is: "+sumo);
        System.out.println("Total Sum is: "+total);
    }
    public static void main(String args[]) throws IOException
    {
        DynamicArrayJavaIO darry=new DynamicArrayJavaIO();
        darry.input();
        darry.output();
    }
}