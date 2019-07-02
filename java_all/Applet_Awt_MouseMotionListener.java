import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_Awt_MouseMotionListener extends Applet implements MouseMotionListener
{
    public void init()
    {
        //GridLayout G=new GridLayout(5,5);
        //setLayout(G);
        addMouseMotionListener(this);
        setSize(500,500);
    }
    public void mouseDragged(MouseEvent me)
    {
        Graphics g=getGraphics();
        Color c=new Color(255,0,0);
        g.setColor(c);
        g.fillOval(me.getX(),me.getY(),10,10);
        showStatus("Mouse Drag Occured!!");
    }
    public void mouseMoved(MouseEvent me)
    {
        showStatus("Mouse Move occured!");
    }
}
/*
<applet code=Applet_Awt_MouseMotionListener height=500 width=500>
</applet>
*/