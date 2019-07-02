import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Awt_Frame_Database_Trigger extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b;
    Panel p1,p2,p3;
    Statement st;
    Connection con;
    ResultSet rs;
    public Awt_Frame_Database_Trigger()
    {
        l1=new Label("Enter Serial No");
        l2=new Label("Enter Password");
        t1=new TextField(10);
        t2=new TextField(10);
        b=new Button("Login");
        p1=new Panel();
        p1.setSize(400,100);
        p1.setLayout(new GridLayout(2,1));
        p1.setBackground(Color.orange);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p2=new Panel();
        p2.setSize(100,50);
        p2.setLayout(new FlowLayout());
        p2.setBackground(Color.orange);
        p2.add(b);
        p3=new Panel();
        p3.setSize(400,200);
        p3.setLayout(new GridLayout(3,1));
        p3.setBackground(Color.orange);
        p3.add(p1,"p1");
        p3.add(p2,"p2");
        add(p3);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b)
        {
            int count=0;
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","jdbc");
                st=con.createStatement();
                String qry="select pwd from mytable where sno='"+t1.getText()+"'";
                rs=st.executeQuery(qry);
                while(rs.next())
                {
                    if((t2.getText()).equals(rs.getString(1)));
                    {
                        System.out.println("Password match");
                    }
                    count++;
                }
                if(count==0)
                {
                    System.out.println("Incorrect Serial Number");
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
        Awt_Frame_Database_Trigger afdt=new Awt_Frame_Database_Trigger();
        afdt.setSize(400,200);
        afdt.setVisible(true);
    }
}