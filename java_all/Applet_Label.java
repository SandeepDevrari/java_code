import java.awt.*;
import java.applet.*;
public class Applet_Label extends Applet
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    TextArea ta;
    public void init()
    {
        l1=new Label("Name");
        l2=new Label("Age");
        l3=new Label("Secret Code");
        l4=new Label("Address");
        t1=new TextField(15);
        t2=new TextField(15);
        t3=new TextField(15);
        ta=new TextArea(5,15);
        setBackground(Color.cyan);
        setLayout(new GridLayout(4,2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        t3.setEchoChar('#');
        add(l4);
        add(ta);
    }
}
/*
    <applet code=Applet_Label height=300 width=400>
    </applet>
*/