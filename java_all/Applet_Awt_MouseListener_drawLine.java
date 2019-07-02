import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_Awt_MouseListener_drawLine extends Applet implements MouseListener
{
    int x,y,a,b;
    public void init()
    {
        addMouseListener(this);
    }
    public void mousePressed(MouseEvent me)
    {
        x=me.getX();
        y=me.getY();
        repaint();
        showStatus("Mouse Pressed Occured!!");
    }
    public void mouseReleased(MouseEvent me)
    {
        a=me.getX();
        b=me.getY();
        repaint();
        showStatus("Mouse released occured!");
    }
    public void mouseClicked(MouseEvent me)
    {
        //int i,j;
        //x=me.getX();
        //y=me.getY();
        //repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        //setBackground(Color.white);
    }
    public void mouseExited(MouseEvent me)
    {
        //setBackground(Color.orange);
    }
    public void paint(Graphics g)
    {
        Color c=new Color(255,0,0);
        g.setColor(c);
        g.drawLine(x,y,a,b);
    }
}
/*
<applet code=Applet_Awt_MouseListener_drawLine height=500 width=500>
</applet>
*/