import java.applet.*;
import java.awt.*;
public class Applet_DrawCircle extends Applet
{
    int start_angle=0,end_angle=0;
    public void init()
    {
        setBackground(Color.black);
        repaint();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawArc(150,150,200,200,start_angle,end_angle);
        /*if(start_angle<90)
        {
            end_angle+=90;
            g.setColor(Color.blue);
            g.drawArc(150,150,200,200,start_angle,end_angle);
            //start_angle=end_angle;
            //end_angle+=90;
        }*/
        if(start_angle>=90 && start_angle<180)
        {
            //end_angle+=90;
            g.setColor(Color.red);
            g.drawArc(150,150,200,200,start_angle,end_angle);
            //start_angle=end_angle;
            //end_angle+=90;
        }
        if(start_angle>=180 && start_angle<270)
        {
            //end_angle+=90;
            g.setColor(Color.green);
            g.drawArc(150,150,200,200,start_angle,end_angle);
            //start_angle=end_angle;
            //end_angle+=90;
        }
        if(start_angle>=270 && start_angle<360)
        {
            //end_angle+=90;
            g.setColor(Color.yellow);
            g.drawArc(150,150,200,200,start_angle,end_angle);
            //start_angle=end_angle;
            //end_angle+=90;
        }
        if(end_angle>360)
        {
            end_angle=90;
            start_angle=0;
        }
        
        //g.drawArc(150,150,200,200,start_angle,end_angle);
        start_angle=end_angle;
        end_angle+=90;
        repaint();
    }
}
/*<applet code=Applet_DrawCircle width=500 height=500>
</applet> */