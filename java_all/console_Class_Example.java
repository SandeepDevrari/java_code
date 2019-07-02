import java.io.Console;
import java.io.IOException;
class Console_Class_Example
{
    Console cons;
    String username,passwd;
    Console_Class_Example() throws IOException
    {
        cons=System.console();
        if(cons==null)
        {
            System.err.println("No Console");
            System.exit(0);
        }
        username=cons.readLine("Username: ");
        passwd=cons.readLine("Password: ");
    }
    void output()
    {
        System.out.println(username+"\n"+passwd);
    }
    public static void main(String args[]) throws IOException
    {
        Console_Class_Example cce=new Console_Class_Example();
        cce.output();
    }
}