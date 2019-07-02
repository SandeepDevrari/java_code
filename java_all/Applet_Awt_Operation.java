import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_Awt_Operation extends Applet implements ActionListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    Button b1;
    Choice ch1;
    int x,y,z;
    public void init()
    {
        setBackground(Color.white);
        GridLayout G=new GridLayout(6,2);
        setLayout(G);
        l1=new Label("X");
        t1=new TextField(4);
        l2=new Label("Y");
        t2=new TextField(4);
        l4=new Label("Select");
        ch1=new Choice();
        l3=new Label("Result");
        t3=new TextField(4);
        ch1.addItem("ADD");
        ch1.addItem("SUB");
        ch1.addItem("MULTI");
        ch1.addItem("DIVIDE");
        b1=new Button("Enter");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(ch1);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            x=Integer.parseInt(t1.getText());
            y=Integer.parseInt(t2.getText());
            if(ch1.getSelectedIndex()==0)
            {
                z=addText(x,y);
            }
            else if(ch1.getSelectedIndex()==1)
            {
                z=subText(x,y);
            }
            else if(ch1.getSelectedIndex()==2)
            {
                z=mulText(x,y);
            }
            else
            {
                z=divText(x,y);
            }
            t3.setText(String.valueOf(z));
        }
    }
    public int addText(int a, int b)
    {
        return (a+b);
    }
    public int subText(int a, int b)
    {
        return (a-b);
    }
    public int divText(int a, int b)
    {
        return (a/b);
    }
    public int mulText(int a, int b)
    {
        return (a*b);
    }
}
/*
<applet code=Applet_Awt_Operation height=400 width=500>
</applet>
*/