import java.awt.*;
import java.awt.event.*;
public class Frame_Awt_CardLayout_Example extends Frame implements ActionListener
{
    String name,age="50",passwrd;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4;
    Button b1,b2,b3,b4,b5,b6,b7;
    Panel p1,p2,p3,p4,p5,p6,p7;
    CardLayout cl;
    public Frame_Awt_CardLayout_Example()
    {
        //setBackground(Color.white);
        l1=new Label("Name");
        l2=new Label("Password");
        l3=new Label("Age");
        l4=new Label("Name");
        l5=new Label("Name");
        l6=new Label(" ");
        l7=new Label(" ");
        l8=new Label("Age");
        t1=new TextField(10);
        t2=new TextField(10);
        t2.setEchoChar('*');
        t3=new TextField(10);
        t4=new TextField(10);
        b1=new Button("Next");
        b2=new Button("Done");
        b3=new Button("Edit");
        b4=new Button("NAME");
        b5=new Button("AGE");
        b6=new Button("SAVE");
        b7=new Button("SAVE");
        p1=new Panel();
        p1.setBackground(Color.orange);
        p1.setSize(400,400);
        p2=new Panel();
        p2.setBackground(Color.red);
        p2.setSize(400,400);
        p3=new Panel();
        p3.setBackground(Color.blue);
        p3.setSize(400,400);
        p4=new Panel();
        p4.setBackground(Color.green);
        p4.setSize(400,400);
        p5=new Panel();
        p5.setBackground(Color.yellow);
        p5.setSize(400,400);
        p6=new Panel();
        p6.setBackground(Color.pink);
        p6.setSize(400,400);
        p7=new Panel();
        p7.setLayout(new FlowLayout());
        p7.setSize(400,400);
        p2.setLayout(new FlowLayout());
        p3.setLayout(new GridLayout(6,2));
        p4.setLayout(new FlowLayout());
        p5.setLayout(new FlowLayout());
        p6.setLayout(new FlowLayout());
        adding();
        //p1.add(l1);
        //p1.add(t1);
        //p1.add(b1);
        //p2.add(l2);
        //p2.add(t2);
        //p2.add(b2);
        //p3.add(l4);
        //p3.add(l6);
        //p3.add(l3);
        //p3.add(l7);
        //p3.add(b3);
        //p4.add(b4);
        //p4.add(b5);
        //p5.add(l5);
        //p5.add(t4);
        //p5.add(b6);
        //p6.add(l8);
        //p6.add(t3);
        //p6.add(b7);
        cl=new CardLayout();
        p7.setLayout(cl);
        p7.add(p1,"p1");
        p7.add(p2,"p2");
        p7.add(p3,"p3");
        p7.add(p4,"p4");
        p7.add(p5,"p5");
        p7.add(p6,"p6");
        add(p7);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)  //p1
        {
            name=t1.getText();
            cl.next(p7);    //p2
        }
        else if(ae.getSource()==b2) //p2
        {
            passwrd=t2.getText();
            l6.setText(name);
            l7.setText(age);
            cl.next(p7);    //p3
        }
        else if(ae.getSource()==b3) //p3
        {
            cl.next(p7);    //p4
        }
        else if(ae.getSource()==b4) //p4    name
        {
            t4.setText(name);
            cl.next(p7);    //p5
        }
        else if(ae.getSource()==b5) //p4    age
        {
            t3.setText(age);
            cl.show(p7,"p6");   //p3
        }
        else if(ae.getSource()==b6) //p5
        {
            name=t4.getText();
            l6.setText(name);
            l7.setText(age);
            System.out.println(name);
            cl.show(p7,"p3");   //p3
        }
        else if(ae.getSource()==b7) //p6
        {
            age=t3.getText();
            l6.setText(name);
            l7.setText(age);
            System.out.println(age);
            cl.show(p7,"p3");   //p3
        }
    }
    public void adding()
    {
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        p2.add(l2);
        p2.add(t2);
        p2.add(b2);
        p3.add(l4);
        p3.add(l6);
        p3.add(l3);
        p3.add(l7);
        p3.add(b3);
        p4.add(b4);
        p4.add(b5);
        p5.add(l5);
        p5.add(t4);
        p5.add(b6);
        p6.add(l8);
        p6.add(t3);
        p6.add(b7);
    }
    public static void main(String args[])
    {
        Frame_Awt_CardLayout_Example face=new Frame_Awt_CardLayout_Example();
        face.setSize(500,500);
        face.setVisible(true);
    }
}