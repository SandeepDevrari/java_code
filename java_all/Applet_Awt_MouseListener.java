import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_Awt_MouseListener extends Applet implements MouseListener
{
    String str;
    int x,y;
    public void init()
    {
        addMouseListener(this);
    }
    public void mousePressed(MouseEvent me)
    {
        x=me.getX();
        y=me.getY();
        showStatus("Mouse Pressed Occured!!");
    }
    public void mouseReleased(MouseEvent me)
    {
        showStatus("Mouse released occured!");
    }
    public void mouseClicked(MouseEvent me)
    {
        str="Mouse Clicked at "+x+","+y+" coordinate";
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        setBackground(Color.yellow);
    }
    public void mouseExited(MouseEvent me)
    {
        setBackground(Color.orange);
    }
    public void paint(Graphics g)
    {
        Color c=new Color(255,0,0);
        g.setColor(c);
        g.drawString(str,x,y);
    }
}
/*
<applet code=Applet_Awt_MouseListener height=500 width=500>
</applet>
*/