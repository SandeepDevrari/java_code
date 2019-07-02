import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_AwtEvent extends Applet implements ActionListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Button b1;
    int x,y,z;
    public void init()
    {
        setBackground(Color.white);
        GridLayout G=new GridLayout(6,2);
        setLayout(G);
        l1=new Label("X");
        l2=new Label("Y");
        l3=new Label("X");
        l4=new Label("Y");
        t1=new TextField(4);
        t2=new TextField(4);
        t3=new TextField(4);
        t4=new TextField(4);
        b1=new Button("Swap");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            x=Integer.parseInt(t1.getText());
            y=Integer.parseInt(t2.getText());
            z=x;
            x=y;
            y=z;
            t3.setText(String.valueOf(x));
            t4.setText(String.valueOf(y));
        }
    }
}
/*
<applet code=Applet_AwtEvent height=400 width=500>
</applet>
*/