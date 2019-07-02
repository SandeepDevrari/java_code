import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
//import java.awt.Image.bufferedimage.*;
import javax.imageio.*;//ImageIO.*;
import java.io.*;
class Awt_Image_Resized extends Frame implements ActionListener
{
    Button b1,b2;
    Panel p1,p2,p3,p4;
    BufferedImage img;
    char size='o';
    Awt_Image_Resized()
    {
    b1=new Button("Minimize");
    b2=new Button("Maximize");
    /*p1=new Panel();
    p1.setLayout(new GridLayout(2,1));
    p1.setBackground(Color.orange);
    p1.setSize(100,500);
    p2=new Panel();
    p2.setLayout(new GridLayout(2,1));
    p2.setBackground(Color.orange);
    p2.setSize(300,500);
    p3=new Panel();
    p3.setLayout(new GridLayout(2,1));
    p3.setBackground(Color.orange);
    p3.setSize(100,500);
    p1.add(b1);
    p3.add(b2);
    p4=new Panel();
    p4.setLayout(new FlowLayout());
    p4.setBackground(Color.orange);
    p4.setSize(500,500);
    p4.add(p1,"p1");
    p4.add(p2,"p2");
    p4.add(p3,"p3");
    add(p4);*/
    //Graphics G=getGraphics();
    try
    {
        img=ImageIO.read(new File("fire.png"));
    }
    catch(IOException io)
    {
        System.out.println(io.getMessage());
    }
    if(img==null)
    {
        System.out.println("image null");
    }
    else
        System.out.println("image not null");
    //G.drawImage(img,50,50,this);
    add(b1);
    add(b2);
    setLayout(new BorderLayout());
    add(b1,BorderLayout.NORTH);
    add(b2,BorderLayout.SOUTH);
    b1.addActionListener(this);
    b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            size='s';
            repaint();
        }
        else if(ae.getSource()==b2)
        {
            size='l';
            repaint();
        }
    }
    public void paint(Graphics g)
    {
        if(size=='s')
        {
            g.drawImage(img,200,100,50,50,null);
            size='o';
        }
        else if(size=='l')
        {
            g.drawImage(img,200,100,200,200,this);
            size='o';
        }
        else if(size=='o')
        {
            g.drawImage(img,200,100,75,75,null);
        }
    }
    public static void main(String args[])
    {
        Awt_Image_Resized air=new Awt_Image_Resized();
        air.setSize(500,500);
        air.setVisible(true);
    }
}