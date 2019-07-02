import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Awt_Frame_Database_Edit extends Frame implements ActionListener,FocusListener
{
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3,t4,t5,t6;
    Button b2,b1;
    Panel p1,p2,p3;
    Connection con;
    Statement st;
    ResultSet rs;
    String qry;
    Dialog dg;
    public Awt_Frame_Database_Edit()
    {
        l1=new Label("Enter Serial No");
        l2=new Label("Name");
        l3=new Label("Gender");
        l4=new Label("Pincode");
        l5=new Label("Language");
        l6=new Label("Password");
        t1=new TextField(15);
        t2=new TextField(15);
        t3=new TextField(15);
        t4=new TextField(15);
        t5=new TextField(15);
        t6=new TextField(15);
        b2=new Button("Update");
        b1=new Button("Incorrect Data!!,Try Again");
        p1=new Panel();
        p1.setBackground(Color.orange);
        p1.setLayout(new GridLayout(7,2));
        p1.setSize(600,400);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);
        p1.add(t5);
        p1.add(l6);
        p1.add(t6);
        p2=new Panel();
        p2.setBackground(Color.orange);
        p2.setLayout(new FlowLayout());
        p2.setSize(50,30);
        p2.add(b2);
        p3=new Panel();
        p3.setBackground(Color.orange);
        p3.setLayout(new GridLayout(3,1));
        p3.setSize(600,500);
        p3.add(p1,"p1");
        p3.add(p2,"p2");
        add(p3);
        dg=new Dialog(this);
        dg.setSize(400,100);
        dg.setTitle("Data Incorrect");
        dg.setLayout(new FlowLayout());
        dg.add(b1);
        b2.addActionListener(this);
        b1.addActionListener(this);
        t1.addFocusListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b2)
        {
            //System.out.println("Updated");
            try
            {
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                //con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","jdbc");
                //st=con.createStatement();
                qry="update mytable set pin='"+t4.getText()+"', pwd='"+t6.getText()+"'where sno="+t1.getText();
                int i=st.executeUpdate(qry);
                //System.out.println("Updated");
                if(i==1)
                {
                    System.out.println("Updated");
                }
            }
            catch(Exception e)
            {
                 System.out.println(e.getMessage());
            }
        }
        else if(ae.getSource()==b1)
        {
            dg.setVisible(false);
        }
    }
    public void focusLost(FocusEvent fe)
    {
        if(fe.getSource()==t1)
        {
            int get_Serial=Integer.parseInt(t1.getText());
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","jdbc");
                st=con.createStatement();
                //qry="select sno from mytable";
                //rs=st.executeQuery(qry);
                int count=0;
                //while(rs.next())
                //{
                  //  count++;
                //}
                //System.out.println(count);
                /*for(int i=1;i<=count;i++)
                    {
                        if(get_Serial==rs.getInt(1))
                        {
                            System.out.println(rs.getInt(1));*/
                            qry="select uname,gen,pin,lang,pwd from mytable where sno="+get_Serial;
                            
                            rs=st.executeQuery(qry);
                            while(rs.next())
                            {
                                t2.setText(rs.getString(1));
                                t3.setText(rs.getString(2));
                                t4.setText(rs.getString(3));
                                t5.setText(rs.getString(4));
                                t6.setText(rs.getString(5));
                                count++;
                            }
                            t2.setEnabled(false);
                            t3.setEnabled(false);
                            t5.setEnabled(false);
                            if(count==0)
                            {
                                dg.setVisible(true);
                            }
                            //break;
                        //}
                        /*else
                        {
                            dg.setVisible(true);
                        }*/
                    //}
            }
            catch(Exception e)
                {
                     System.out.println(e.getMessage());
                }
        }
    }
    public void focusGained(FocusEvent fe)
    {
        
    }
    public static void main(String args[])
    {
        Awt_Frame_Database_Edit afde=new Awt_Frame_Database_Edit();
        afde.setVisible(true);
        afde.setSize(600,500);
    }
}