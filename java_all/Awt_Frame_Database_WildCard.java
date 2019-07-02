import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Awt_Frame_Database_WildCard extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6;
    TextField t;
    Button b1,b2,b3;
    List lt1,lt2,lt3,lt4;
    Checkbox cb1,cb2,cb3,cb4;
    CheckboxGroup cbg;
    Panel p1,p2,p3,p4,p5,p6;
    Statement st;
    Connection con;
    ResultSet rs;
    Dialog dg;
    public Awt_Frame_Database_WildCard()
    {
        l1=new Label("Select Choice");
        l2=new Label("Enter Name or Part of Name");
        l3=new Label("Name");
        l4=new Label("Language");
        l5=new Label("Gender");
        l6=new Label("Pincode");
        t=new TextField(10);
        cbg=new CheckboxGroup();
        cb1=new Checkbox("Start",cbg,false);
        cb2=new Checkbox("Middle",cbg,false);
        cb3=new Checkbox("End",cbg,false);
        cb4=new Checkbox("Complete",cbg,false);
        b1=new Button("SEARCH");
        b2=new Button("CLEAR");
        b3=new Button("incorrect");
        lt1=new List(4);
        lt1.addItem("");
        lt2=new List(4);
        lt2.addItem("");
        lt3=new List(4);
        lt3.addItem("");
        lt4=new List(4);
        lt4.addItem("");
        p1=new Panel();
        p1.setSize(800,100);
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.orange);
        p1.add(l1);
        p1.add(cb1);
        p1.add(cb2);
        p1.add(cb3);
        p1.add(cb4);
        p2=new Panel();
        p2.setSize(800,100);
        p2.setLayout(new FlowLayout());
        p2.setBackground(Color.orange);
        p2.add(l2);
        p2.add(t);
        p3=new Panel();
        p3.setSize(800,50);
        p3.setLayout(new FlowLayout());
        p3.setBackground(Color.orange);
        p3.add(b1);
        p4=new Panel();
        p4.setSize(800,200);
        p4.setLayout(new FlowLayout());
        p4.setBackground(Color.orange);
        p4.add(l3);
        p4.add(lt1);
        p4.add(l4);
        p4.add(lt2);
        p4.add(l5);
        p4.add(lt3);
        p4.add(l6);
        p4.add(lt4);
        p5=new Panel();
        p5.setSize(800,50);
        p5.setLayout(new FlowLayout());
        p5.setBackground(Color.orange);
        p5.add(b2);
        p6=new Panel();
        p6.setSize(800,500);
        p6.setLayout(new GridLayout(6,1));
        p6.setBackground(Color.orange);
        p6.add(p1,"p1");
        p6.add(p2,"p2");
        p6.add(p3,"p3");
        p6.add(p4,"p4");
        p6.add(p5,"p5");
        add(p6);
        dg=new Dialog(this);
        dg.setSize(400,100);
        dg.setTitle("Data Incorrect");
        dg.setLayout(new FlowLayout());
        dg.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            //System.out.println(cur.getLabel());
            //char c='';
            String wild_card=null;
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","jdbc");
                st=con.createStatement();
                Checkbox current=cbg.getCurrent();
                String current_label=current.getLabel();
                if(current_label.equals("Start"))
                {
                    wild_card=t.getText()+"%";
                }
                else if(current_label.equals("Middle"))
                {
                    wild_card="%"+t.getText()+"%";
                }
                else if(current_label.equals("End"))
                {
                    wild_card="%"+t.getText();
                }
                else
                {
                    wild_card=t.getText();
                }
                String qry="select uname,lang,gen,pin from mytable where uname like'"+wild_card+"'";
                rs=st.executeQuery(qry);
                int count=0;
                while(rs.next())
                {
                    lt1.addItem(rs.getString(1));
                    lt2.addItem(rs.getString(2));
                    lt3.addItem(rs.getString(3));
                    lt4.addItem(rs.getString(4));
                    count++;
                }
                if(count==0)
                {
                    dg.setVisible(true);
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else if(ae.getSource()==b2)
        {
            t.setText("");
            Checkbox current=cbg.getCurrent();
            cbg.setCurrent(null);
            current.setState(false);
            lt1.removeAll();
            lt2.removeAll();
            lt3.removeAll();
            lt4.removeAll();
        }
        else if(ae.getSource()==b3)
        {
            dg.setVisible(false);
            t.setText("");
            Checkbox current=cbg.getCurrent();
            cbg.setCurrent(null);
            current.setState(false);
            lt1.removeAll();
            lt2.removeAll();
            lt3.removeAll();
            lt4.removeAll();
        }
    }
    public static void main(String args[])
    {
        Awt_Frame_Database_WildCard afdw=new Awt_Frame_Database_WildCard();
        afdw.setSize(800,500);
        afdw.setVisible(true);
    }
}