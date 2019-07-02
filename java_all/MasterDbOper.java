import java.awt.event.*;
import java.awt.*;
public class MasterDbOper extends Frame implements ActionListener
{
    MenuBar mb;
    Menu mn1,mn2,mn3,mn4,mn5,mn6;
    MenuItem mi1,mi2,mi3,mi4,mi5,mi6;
    public MasterDbOper()
    {
        mb=new MenuBar();
        mn1=new Menu("Login");
        mn2=new Menu("Add");
        mn3=new Menu("Delete");
        mn4=new Menu("Edit");
        mn5=new Menu("Search");
        mn6=new Menu("Close");
        mi1=new MenuItem("Login");
        mi2=new MenuItem("Add New Record");
        mi3=new MenuItem("Delete Record ");
        mi4=new MenuItem("Edit Record");
        mi5=new MenuItem("Search Record");
        mi6=new MenuItem("Close All");
        mn1.add(mi1);
        mn2.add(mi2);
        mn3.add(mi3);
        mn4.add(mi4);
        mn5.add(mi5);
        mn6.add(mi6);
        mb.add(mn1);
        mb.add(mn2);
        mb.add(mn3);
        mb.add(mn4);
        mb.add(mn5);
        mb.add(mn6);
        setLayout(new BorderLayout());
        setBackground(Color.orange);
        this.setMenuBar(mb);
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==mi1)
        {
            Awt_Frame_Database_Trigger afdt=new Awt_Frame_Database_Trigger();
            afdt.setSize(400,200);
            afdt.setVisible(true);
        }
        else if(ae.getSource()==mi2)
        {
            Frame_Awt_CardLayout_Example2 face2=new Frame_Awt_CardLayout_Example2();
            face2.setSize(500,500);
            face2.setVisible(true);
        }
        else if(ae.getSource()==mi3)
        {
            Awt_Database_Frame adf=new Awt_Database_Frame();
            adf.setSize(800,600);
            adf.setVisible(true);
        }
        else if(ae.getSource()==mi4)
        {
            Awt_Frame_Database_Edit afde=new Awt_Frame_Database_Edit();
            afde.setVisible(true);
            afde.setSize(600,500);
        }
        else if(ae.getSource()==mi5)
        {
            Awt_Frame_Database_WildCard afdw=new Awt_Frame_Database_WildCard();
            afdw.setSize(800,500);
            afdw.setVisible(true);
        }
        else if(ae.getSource()==mi6)
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        MasterDbOper mdo=new MasterDbOper();
        mdo.setSize(500,300);
        mdo.setVisible(true);
    }
}
