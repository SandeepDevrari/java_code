import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Applet_Test extends Applet implements ActionListener
{
    int x;
    Button b1,b2;
    Checkbox cb1,cb2;
    List list1;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Choice ch1,ch2;
    TextField t1,t2,t3,t4,t5;
    TextArea ta;
    public void init()
    {
        setBackground(Color.white);
        GridLayout G=new GridLayout(10,2);
        setLayout(G);
        l1=new Label("Name");
        l2=new Label("DOB");
        l3=new Label("Father Name");
        l4=new Label("Mother Name");
        l5=new Label("Course");
        l6=new Label("Branch");
        l7=new Label("College");
        l8=new Label("About");
        l9=new Label("Gender");
        l10=new Label("CODE");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        t5=new TextField(10);
        t5.setEchoChar('*');
        ch1=new Choice();
        ch2=new Choice();
        ch1.addItem("B.TECH");
        ch1.addItem("DIPLOMA");
        ch2.addItem("CSE");
        ch2.addItem("ME");
        ch2.addItem("EEE");
        ch2.addItem("ECE");
        list1=new List(2);
        list1.addItem("ABC");
        list1.addItem("XYZ");
        ta=new TextArea(4,4);
        cb1=new Checkbox("Male",false);
        cb2=new Checkbox("Female",false);
        b1=new Button("SUBMIT");
        b2=new Button("CLEAR");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(ch1);
        add(l6);
        add(ch2);
        add(l7);
        add(list1);
        add(l8);
        add(l9);
        add(cb1);
        add(cb2);
        add(ta);
        add(l10);
        add(t5);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            //System.out.println("Submitted");
            t1.setText("Welcome");
            t2.setText("Welcome");
            t3.setText("Welcome");
            t4.setText("Welcome");
            t5.setText("Welcome");
        }
        if(ae.getSource()==b2)
        {
            System.out.println("@@");
        }
    }
}
/*
<applet code=Applet_Test height=600 width=500>
</applet>
*/