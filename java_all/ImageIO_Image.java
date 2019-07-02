import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.lang.Thread.*;
import java.lang.Runnable.*;
public class ImageIO_Image extends Frame implements ActionListener
{
    Button b1,b2;
    Thread t1,t2;
    int i,j;
    boolean done=false;
    BufferedImage img,img1;
    public ImageIO_Image() 
    {
        //t1=new Thread();
        b1=new Button("START");
        b2=new Button("STOP");
        /*try
        {
            img=ImageIO.read(new File("fire.png"));
            img1=ImageIO.read(new File("fire.png"));
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }*/
        //p1=new Panel();
        //p1.setSize(200,50);
        //p1.setLayout(new FlowLayout());
        //p1.setBackground(Color.orange);
        //p1.add(b1);
        //p1.add(b2);
        //p2=new Panel();
        //p2.setSize(500,400);
        //p2.setLayout(new GridLayout(5,1));
        //p2.setBackground(Color.orange);
        //p2.add(p1,"p1");
        //add(p2);
        setBackground(Color.white);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    /*public void run()
    {
        
    }*/
   
    public void actionPerformed(ActionEvent ae)
    {
        //Graphics g=getGraphics();
        if(ae.getSource()==b1)
        {
            /*for(;;)
            {
                //if(!done)
                //{
                    try
                    {
                        //repaint();
                        t1.sleep(500);
                        g.clearRect(50,50,585,300);
                        g.drawImage(img,50+(i++)*10,50,null);
                        g.drawImage(img1,550-(j++)*10,250,null);
                    }
                    catch(InterruptedException ie)
                    {
                        System.out.println(ie.getMessage());
                    }
                //}
            }*/
            thread1_class th1=new thread1_class();
            thread2_class th2=new thread2_class();
            t1=new Thread(th1);
            t1.start();
            t2=new Thread(th2);
            t2.start();
        }
        else if(ae.getSource()==b2)
        {
            t1.stop();
        }
    }
    public static void main(String args[])
    {
        ImageIO_Image ti=new ImageIO_Image();
        ti.setSize(700,400);
        ti.setVisible(true);
        
        //Thread t1=new Thread(ti);
        //t1.start();
    }
}
class thread1_class extends Frame implements Runnable
{
    BufferedImage img;
    int i,j;
    /*thread1_class()
    {
        Graphics g1=getGraphics();
        try
        {
            img=ImageIO.read(new File("fire.png"));
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
                g1.clearRect(50,50,585,300);
                g1.drawImage(img,50+(i++)*10,50,null);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.getMessage());
            }
        }
    }*/
    public void run()
    {
        Graphics g1=getGraphics();
        try
        {
            img=ImageIO.read(new File("fire.png"));
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
                g1.clearRect(50,50,585,300);
                g1.drawImage(img,50+(i++)*10,50,null);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.getMessage());
            }
        }
    }
}
class thread2_class extends Frame implements Runnable
{
    BufferedImage img1;
    int i,j;
    thread2_class()
    {
        Graphics g2=getGraphics();
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
                //g.clearRect(50,50,585,300);
                g2.drawImage(img1,550-(j++)*10,250,null);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.getMessage());
            }
        }
    }
    public void run()
    {
        
    }
}