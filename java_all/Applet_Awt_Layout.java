import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_Awt_Layout extends Applet implements ActionListener
{
    Button b1,b2,b3,b4,b5;
    //int r,b,g;
    public void init()
    {
        b1=new Button("Top");
        b1.setBackground(Color.red);
        b2=new Button("Left");
        b2.setBackground(Color.green);
        b3=new Button("Right");
        b3.setBackground(Color.blue);
        b4=new Button("Bottom");
        b4.setBackground(Color.yellow);
        b5=new Button("Center");
        b5.setBackground(Color.black);
        setLayout(new BorderLayout());
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.WEST);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.CENTER);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        /*if(ae.getSource()==b1)
        {
            Graphics G=setGraphics();
            r++;
            b++;
            g++;
            b1.setBackground(Color.(new Color(r,b,g)));
            //repaint();
        }*/
        
    }
    /*public void paint(Graphics G)
    {
        r++;
        b++;
        g++;
        Color c=new Color(r,b,g);
        //b1.setBackground(Color.red);
        G.setColor(c);
    }*/
}
/*
<applet code=Applet_Awt_Layout height=400 width=500>
</applet>
*/