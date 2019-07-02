import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Frame_Awt_CardLayout_Example2 extends Frame implements ActionListener, ItemListener,FocusListener
{
    String name,age,passwrd,gen,lang,pincode;
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3,t4;
    Button b1,b2,b3;
    Panel p1,p2,p3;
    Choice ch;
    CheckboxGroup cg;
    Checkbox cb1,cb2;
    public Frame_Awt_CardLayout_Example2()
    {
        l1=new Label("Name");
        l2=new Label("Password");
        l3=new Label("Conform Password");
        l4=new Label("Gender");
        l5=new Label("Language");
        l6=new Label("Pincode");
        t1=new TextField(10);
        t2=new TextField(10);
        t2.setEchoChar('*');
        t3=new TextField(10);
        t3.setEchoChar('*');
        t4=new TextField(10);
        b1=new Button("Save");
        b2=new Button("Clear");
        b3=new Button("Close");
        ch=new Choice();
        ch.addItem("Hindi");
        ch.addItem("English");
        cg=new CheckboxGroup();
        cb1=new Checkbox("M",cg,false);
        cb2=new Checkbox("F",cg,false);
        p1=new Panel();
        p1.setBackground(Color.orange);
        p1.setLayout(new GridLayout(12,2));
        p2=new Panel();
        p2.setBackground(Color.orange);
        p2.setLayout(new FlowLayout());
        p3=new Panel();
        p3.setBackground(Color.orange);
        p3.setLayout(new FlowLayout());
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(cb1);
        p1.add(cb2);
        p1.add(l5);
        p1.add(ch);
        p1.add(l6);
        p1.add(t4);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p3.add(p1,"p1");
        p3.add(p2,"p2");
        add(p3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        ch.addItemListener(this);
        t3.addFocusListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            pincode=t4.getText();
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","jdbc");
                Statement st=con.createStatement();
                String qry="Insert into mytable values( sno.nextval,'"+name+"','"+passwrd+"','"+gen+"','"+lang+"','"+pincode+"')";
                int ans=st.executeUpdate(qry);
                if(ans==1)
                System.out.println("Data Saved ");
            }
            catch(Exception ex)
            {
                 System.out.println(ex.getMessage());
            }
            
        }
        else if(ae.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }
        else if(ae.getSource()==b3)
        {
            System.exit(0);
        }
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==ch)
        {
            if(ch.getSelectedIndex()==0)
            {
                name=t1.getText();
                passwrd=t2.getText();
                gen="Male"; //String.valueOf(cg.getSelectedCheckbox());
                lang="Hindi";
                System.out.println(name+" "+passwrd+" "+gen+" "+lang);
            }
            else if(ch.getSelectedIndex()==1)
            {
                name=t1.getText();
                passwrd=t2.getText();
                gen="Male"; //String.valueOf(cg.getSelectedCheckbox());;
                lang="English";
                System.out.println(name+" "+passwrd+" "+gen+" "+lang);
            }
        }
    }
    public void focusLost(FocusEvent fe)
    {
        if(fe.getSource()==t3)
        {
            if((t2.getText()).equals(t3.getText()))
            {
                System.out.println("correct Password");
            }
            else
            {
                System.out.println("Incorrect password");
            }
        }
    }
    public void focusGained(FocusEvent fe)
    {
        
    }
    public static void main(String args[])
    {
        Frame_Awt_CardLayout_Example2 face=new Frame_Awt_CardLayout_Example2();
        face.setSize(500,500);
        face.setVisible(true);
    }
}