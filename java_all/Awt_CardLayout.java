import java.awt.*;
import java.awt.event.*;
public class Awt_CardLayout extends Frame implements ActionListener
{
    Panel p1,p2,p3,p4;
    Label l1,l2,l3,l4,l5;
    TextField t1,t2 ;
    Button b1,b2,b3,b4,b5;
    CardLayout cl;
    public Awt_CardLayout()
    {
        b1=new Button("Next");
        b2=new Button("Prev");
        b3=new Button("Next");
        b4=new Button("Prev");
        b5=new Button("First");
        l1=new Label("Welcome");
        l2=new Label("Email");
        l3=new Label("Password");
        l4=new Label("Thanks");
        l5=new Label("CardLayout");
        t1=new TextField(15);
        t2=new TextField(15);
        p1=new Panel();
        p2=new Panel();
        p3=new Panel();
        p4=new Panel();
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.cyan);
        p1.add(l1);
        p1.add(b1);
        p2.setLayout(new FlowLayout());
        p2.setBackground(Color.yellow);
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(t2);
        p2.add(b2);
        p2.add(b3);
        p3.setLayout(new FlowLayout());
         p3.setBackground(Color.pink);
        p3.add(l4);
        p3.add(l5);
        p3.add(b4);
        p3.add(b5);
        
        cl=new CardLayout();
        p4.setLayout(cl);
        p4.add(p1,"First");
        p4.add(p2,"Second");
        p4.add(p3,"Third");
        //add(cl);
        add(p4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()==b1)
         cl.next(p4);
      if(ae.getSource()==b2)
         cl.previous(p4);
      if(ae.getSource()==b3)
         cl.next(p4);
      if(ae.getSource()==b4)
         cl.previous(p4);
      if(ae.getSource()==b5)
         cl.first(p4);
     
    }
    public static void main(String ar[])
    {
        Awt_CardLayout cl1=new Awt_CardLayout();
        cl1.setSize(400,500);
        cl1.setVisible(true);
    }
}