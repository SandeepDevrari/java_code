import java.io.*;
class DynamicJavaIO
{
    InputStreamReader isr;
    BufferedReader br;
    int yr1,yr2,yr3;
    float total;
    String name;
    void set() throws IOException
    {
        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        System.out.println("Enter Name:");
        name=br.readLine();
        System.out.println("Enter Marks of 3 years");
        yr1=Integer.parseInt(br.readLine());
        yr2=Integer.parseInt(br.readLine());
        yr3=Integer.parseInt(br.readLine());
        total=((.25f*yr1)/100)+((.25f*yr2)/100)+((.50f*yr3)/100);
    }
    void get() throws IOException
    {
        System.out.println("Name: "+name);
        System.out.println("Total: "+total);
    }
    public static void main(String args[]) throws IOException
    {
        DynamicJavaIO io=new DynamicJavaIO();
        io.set();
        io.get();
    }
}