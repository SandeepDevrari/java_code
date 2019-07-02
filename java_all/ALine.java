import java.awt.*;
import java.applet.*;
public class ALine extends Applet
{ 
int linex,linem = 1; 
public void init() 
 {
 setBackground(Color.black); 
 repaint();
 }
 public void paint(Graphics g)
 {
 super.paint(g);
 g.setColor(Color.red); 
 g.drawLine(linem,200,310,400); 
 if(linex > 500)
 {
 linem = -500;
 g.setColor(Color.green); 
 g.drawLine(linem,200,310,400); 
 }
 if(linex < 0)
 {
 linem = 600;
 g.setColor(Color.yellow); 
 g.drawLine(linem,200,310,400); 
 }
 linex += linem; 
 repaint(); 
 }
} 
/*
<APPLET CODE="ALine" WIDTH="800" HEIGHT="500">
</APPLET>
*/