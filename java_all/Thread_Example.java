import java.lang.Thread.*;
import java.lang.Runnable.*;
public class Thread_Example extends Thread
{
    Thread t1;
    public void start_Ready()
    {
        t1=new Thread();
        t1.start();
        System.out.println("Thread Created And Ready to run");
    }
    public void runThread()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                t1.sleep(500);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println(ie.getMessage());
        }
    }
    public void killThread()
    {
        t1.stop();
    }
    public static void main(String args[])
    {
        Thread_Example te=new Thread_Example();
        te.start_Ready();
        te.runThread();
        te.killThread();
    }
}