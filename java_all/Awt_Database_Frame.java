import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Awt_Database_Frame extends Frame implements ActionListener,ItemListener
{
    Label l1,l2,l3,l4,l5,l6,l7;
    Button b1,b2,b3,b4;
    List lt1,lt2,lt3,lt4;
    Panel  p1,p2,p3,p4;
    Choice ch;
    Connection con;
    Statement st;
    String qry,selected_item;
    ResultSet rs;
    Dialog dg,dg1;
    public Awt_Database_Frame()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","jdbc");
            st=con.createStatement();
            qry="select sno from mytable";
            rs=st.executeQuery(qry);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        l1=new Label("Select SNo");
        l2=new Label("Name");
        l3=new Label("Gender");
        l4=new Label("Language");
        l5=new Label("Pincode");
        l6=new Label("Are you Sure, you want to delete?");
        l7=new Label("Data Deleted");
        ch=new Choice();
        try
        {
            while(rs.next())
                {
                    ch.addItem(String.valueOf(rs.getInt(1)));
                }
        }
        catch(Exception e)
        {
             System.out.println(e.getMessage());
        }
        lt1=new List(3);
        lt1.addItem("");
        lt2=new List(3);
        lt2.addItem("");
        lt3=new List(3);
        lt3.addItem("");
        lt4=new List(3);
        lt4.addItem("");
        b1=new Button("Delete");
        b2=new Button("Yes");
        b3=new Button("No");
        b4=new Button("OK");
        p1=new Panel();
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.orange);
        p1.setSize(800,200);
        p1.add(l1);
        p1.add(ch);
        p2=new Panel();
        p2.setLayout(new FlowLayout());
        p2.setBackground(Color.orange);
        p2.add(l2);
        p2.add(lt4);
        p2.add(l3);
        p2.add(lt1);
        p2.add(l4);
        p2.add(lt2);
        p2.add(l5);
        p2.add(lt3);
        p3=new Panel();
        p3.setLayout(new FlowLayout());
        p3.setBackground(Color.orange);
        p3.setSize(50,50);
        p3.add(b1);
        p4=new Panel();
        p4.setLayout(new GridLayout(5,1));
        p4.setBackground(Color.orange);
        p4.add(p1,"p1");
        p4.add(p2,"p2");
        p4.add(p3,"p3");
        add(p4);
        dg=new Dialog(this);
        dg.setSize(400,100);
        dg.setTitle("Delete Confirmation");
        dg.setLayout(new FlowLayout());
        dg.add(l6);
        dg.add(b2);
        dg.add(b3);
        dg1=new Dialog(this);
        dg1.setSize(200,100);
        dg1.setLayout(new FlowLayout());
        dg1.add(l7);
        dg1.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        ch.addItemListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String name=null,gen=null,lang=null,pin=null;
            name=lt4.getSelectedItem();
            gen=lt1.getSelectedItem();
            lang=lt2.getSelectedItem();
            pin=lt3.getSelectedItem();
            System.out.println(name+" "+gen+" "+lang+" "+pin);
            dg.setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
            try
            {
                qry="delete from mytable where sno="+selected_item;
                int i=st.executeUpdate(qry);
                if(i==1)
                {
                    System.out.println("Data Deleted");
                    dg.setVisible(false);
                    dg1.setVisible(true);
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else if(ae.getSource()==b3)
        {
            dg.setVisible(false);
        }
        else if(ae.getSource()==b4)
        {
            dg1.setVisible(false);
        }
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==ch)
        {
            int index=ch.getSelectedIndex();
            selected_item=ch.getItem(index);
            try
            {
                qry="select uname,lang,gen,pin from mytable where sno="+selected_item;
                rs=st.executeQuery(qry);
                try
                {
                    while(rs.next())
                    {
                        lt4.addItem(rs.getString(1));
                        lt1.addItem(rs.getString(2));
                        lt2.addItem(rs.getString(3));
                        lt3.addItem(rs.getString(4));
                    }
                }
                catch(Exception e)
                {
                     System.out.println(e.getMessage());
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String args[])
    {
        Awt_Database_Frame adf=new Awt_Database_Frame();
        adf.setSize(800,600);
        adf.setVisible(true);
    }
}