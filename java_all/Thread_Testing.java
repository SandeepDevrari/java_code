import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.lang.Thread.*;
import java.lang.Runnable.*;
public class Thread_Testing extends Frame implements ActionListener
{
    Button b1,b2;
    Thread t1,t2;
    int i,j;
    boolean done=false;
    BufferedImage img,img1;
    public Thread_Testing() 
    {
        b1=new Button("START");
        b2=new Button("STOP");
        setBackground(Color.white);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        System.out.println("Main Class");
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            //thread1_class th1=new thread1_class();
            //thread2_class th2=new thread2_class();
            /*t1=new Thread();
            t1.start();
            t2=new Thread(th2);
            t2.start();*/
        }
        else if(ae.getSource()==b2)
        {
            //t1.stop();
        }
    }
    public static void main(String args[])
    {
        Thread_Testing ti=new Thread_Testing();
        ti.setSize(700,400);
        ti.setVisible(true);
        thread1_class th1=new thread1_class();
        thread2_class th2=new thread2_class();
    }
}
class thread1_class extends Frame implements Runnable
{
    BufferedImage img;
    //int i,j;
    Thread t;
    Graphics g1;
    thread1_class()
    {
        t=new Thread(this,"thread1");
        t.start();
    }
    public void run()
    {
        
        try
        {
            img=ImageIO.read(new File("fire.png"));
            g1=img.getGraphics();
        
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        for(;;)
        {
            try
            {
                t.sleep(500);
         //       System.out.println("Hi .... ");
                g1.clearRect(50,50,585,300);
         //       System.out.println("Hello  .... ");
                //g1.drawImage(img,50+(i++)*10,50,null);
                g1.drawImage(img,50*10,50,null);
         //       System.out.println("HiHello .... ");
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
                System.out.println(ie.getMessage());
            }
        }
        //System.out.println("Thread 1");
    }
}
class thread2_class extends Frame implements Runnable
{
    /*BufferedImage img1;
    int i,j;*/
    Thread t;
    thread2_class()
    {
        t=new Thread(this,"thread1");
        t.start();
    }
    public void run()
    {
        /*Graphics g2=getGraphics();
        try
        {
            img1=ImageIO.read(new File("fire.png"));
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        for(;;)
        {
            try
            {
                Thread.sleep(500);
                g2.drawImage(img1,550-(j++)*10,250,null);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.getMessage());
            }
        }*/
        System.out.println("Thread 2");
    }
}