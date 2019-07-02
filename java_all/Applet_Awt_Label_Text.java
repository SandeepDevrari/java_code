import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Applet_Awt_Label_Text extends Applet implements FocusListener
{
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7,t8;
    public void init()
    {
        setBackground(Color.orange);
        GridLayout G=new GridLayout(9,2);
        setLayout(G);
        l1=new Label("Name");
        l2=new Label("Year 1");
        l3=new Label("Year 2");
        l4=new Label("Year 3");
        l5=new Label("Year 4");
        l6=new Label("Grand Total");
        l7=new Label("Average");
        l8=new Label("Grade");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        t5=new TextField(10);
        t6=new TextField(10);
        t7=new TextField(10);
        t8=new TextField(10);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(l7);
        add(t7);
        add(l8);
        add(t8);
        t5.addFocusListener(this);
    }
    public void focusLost(FocusEvent fe)
    {
        if(fe.getSource()==t5)
        {
            int yr1=Integer.parseInt(t2.getText());
            int yr2=Integer.parseInt(t2.getText());
            int yr3=Integer.parseInt(t2.getText());
            int yr4=Integer.parseInt(t2.getText());
            int tot=yr1+yr2+yr3+yr4;
            float avg=tot/4.0f;
            t6.setText(String.valueOf(tot));
            t7.setText(String.valueOf(avg));
            t8.setText(String.valueOf("A"));
        }
    }
    public void focusGained(FocusEvent fe)
    {}
}
/*
<applet code=Applet_Awt_Label_Text height=500 width=600>
</applet>
*/