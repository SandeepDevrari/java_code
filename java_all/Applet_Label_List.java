import java.awt.*;
import java.applet.*;
public class Applet_Label_List extends Applet
{
    List list1,list2;
    Choice ch1,ch2;
    Label l1,l2,l3,l4;
    public void init()
    {
        l1=new Label("City Name");
        l2=new Label("State");
        l3=new Label("Age");
        l4=new Label("Pincode");
        setBackground(Color.white);
        setLayout(new GridLayout(4,2));
        list1=new List(3);
        list1.addItem("Mumbai");
        list1.addItem("Dehradun");
        list1.addItem("Delhi");
        list1.addItem("Gurgaon");
        ch1=new Choice();
        ch1.addItem("UK");
        ch1.addItem("TN");
        ch1.addItem("WB");
        ch1.addItem("ND");
        list2=new List(10);
        for(int i=15;i<=50;i++)
        {
            list2.addItem(String.valueOf(i));
        }
        ch2=new Choice();
        for(int i=248000;i<=248050;i++)
        {
            ch2.addItem(String.valueOf(i));
        }
        add(l1);
        add(list1);
        add(l2);
        add(ch1);
        add(l3);
        add(list2);
        add(l4);
        add(ch2);
    }
}
/*<applet code=Applet_Label_List height=300 width=500>
</applet>
*/