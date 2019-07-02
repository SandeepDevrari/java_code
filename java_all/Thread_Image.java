import java.awt.*;
import java.awt.event.*;
import java.lang.Thread.*;
import java.lang.Runnable.*;
import java.applet.*;
import javax.swing.*;
public class Thread_Image extends Applet implements ActionListener
{
    Button b1,b2;
    Panel p1,p2;
    Image img;
    int i;
    Thread t1;
    public void init() 
    //Thread_Image()
    {
        t1=new Thread();
        img=getImage(getDocumentBase(),"fire.png");
        b1=new Button("START");
        b2=new Button("STOP");
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
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
   
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            repaint();
        }
        else if(ae.getSource()==b2)
        {
        
        }
    }
    public void paint(Graphics g)
    {
        try
            {
                for(i=1;i<=100;i+=10)
                {
                     repaint();
                     t1.sleep(500);
                     g.drawImage(img,50+i*10,50,this);
                     validate();
                     System.out.println("ggggg");
                }
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.getMessage());
            }
       
    }
    
    /*public static void main(String args[])
    {
        Thread_Image ti=new Thread_Image();
        ti.setSize(500,400);
        ti.setVisible(true);
        
        //Thread t1=new Thread(ti);
        //t1.start();
    }*/
}

/*
<applet code=Thread_Image height=200 width=1200></applet>
*/