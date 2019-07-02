import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_Awt_MouseMotionListener_fillRect extends Applet implements MouseMotionListener
{
int a,b,c;
Color C;
    public void init()
    {
        setBackground(Color.white);
        setSize(255,255);
        addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent me)
    {
        //a=me.getX();
        //b=me.getY();
        //c=a;
        //repaint();
        showStatus("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent me)
    {
        a=me.getX();
        b=me.getY();
        c=a;
        repaint();
        showStatus("Mouse Moved");
    }
    public void paint(Graphics g)
    {
        C=new Color(a,b,c);
        g.setColor(C);
        g.fillRect(10,10,a,b);
    }
}
/*
<applet code=Applet_Awt_MouseMotionListener_fillRect width=255 height=255>
</applet>
*/