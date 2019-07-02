import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_Awt_ItemListener extends Applet implements ItemListener //ActionListener,
{
    int cake_p=50,pizza_p=70,burger_p=30,shake_p=20,ice_cream_p=15,quantity,amount;
    Choice ch1,ch2,ch3;
    float tax=15.25f,pay_amount,tax_amount;
    TextField t1,t2,t3,t4,t5;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    public void init()
    {
        setBackground(Color.orange);
        GridLayout G=new GridLayout(10,2);
        setLayout(G);
        l1=new Label("Product Name");
        l2=new Label("Product Category");
        l3=new Label("Product Quantity");
        l4=new Label("Product Price");
        l5=new Label("Service Tex");
        l6=new Label("Amount");
        l7=new Label("Tax Amount");
        l8=new Label("Payable Amount");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        t5=new TextField(10);
        ch1=new Choice();
        ch1.addItem("cake");
        ch1.addItem("pizza");
        ch1.addItem("burger");
        ch1.addItem("shake");
        ch1.addItem("ice-cream");
        ch2=new Choice();
        ch2.addItem("soft-drink");
        ch2.addItem("snack");
        ch2.addItem("Dessert");
        ch3=new Choice();
        ch3.addItem("1");
        ch3.addItem("2");
        ch3.addItem("3");
        ch3.addItem("4");
        ch3.addItem("5");
        ch3.addItem("6");
        add(l1);
        add(ch1);
        add(l2);
        add(ch2);
        add(l3);
        add(ch3);
        add(l4);
        add(t1);
        add(l5);
        add(t2);
        add(l6);
        add(t3);
        add(l7);
        add(t4);
        add(l8);
        add(t5);
        ch1.addItemListener(this);
        //ch2.addItemListener(this);
        ch3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==ch1)
        {
            if(ch1.getSelectedIndex()==0)
            {
                //ch2.setSelectedIndex()
                t1.setText(String.valueOf(cake_p));
                t2.setText(String.valueOf(tax)+"%");
            }
            else if(ch1.getSelectedIndex()==1)
            {
                t1.setText(String.valueOf(pizza_p));
                t2.setText(String.valueOf(tax)+"%");
            }
            else if(ch1.getSelectedIndex()==2)
            {
                t1.setText(String.valueOf(burger_p));
                t2.setText(String.valueOf(tax)+"%");
            }
            else if(ch1.getSelectedIndex()==3)
            {
                t1.setText(String.valueOf(shake_p));
                t2.setText(String.valueOf(tax)+"%");
            }
            else
            {
                t1.setText(String.valueOf(ice_cream_p));
                t2.setText(String.valueOf(tax)+"%");
            }
        }
        if(ie.getSource()==ch3)
        {
            quantity=(ch3.getSelectedIndex()+1);
            //int amt,tamt,pamt=amount(Integer.parseInt(t1.getText()),quantity,tex);
            amount(Integer.parseInt(t1.getText()),quantity,tax);
            //int tamt=txt_amount(cake_p,quantity);
            t3.setText(String.valueOf(amount));
            t4.setText(String.valueOf(tax_amount));
            t5.setText(String.valueOf(pay_amount));
        }
    }
    public void amount(int price,int qunti,float tax)
    {
        amount=price*qunti;
        tax_amount=(price*(tax/100))*qunti;
        pay_amount=amount+tax_amount;
        //return (amount tex_amount pay_amount);
    }
} 
/*
<applet code=Applet_Awt_ItemListener height=600 width=500>
</applet>
*/