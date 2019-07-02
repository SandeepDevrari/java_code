import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_Awt_Label_Keylistener extends Applet implements KeyListener,ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2;
    Button b1;
    public void init()
    {
        setBackground(Color.orange);
        GridLayout G=new GridLayout(5,1);
        setLayout(G);
        l1=new Label("Name");
        l2=new Label("Age");
        l3=new Label("");
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("DISPLAY");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
        t1.addKeyListener(this);
        t2.addKeyListener(this);
        b1.addActionListener(this);
    }
    public void keyPressed(KeyEvent ke)
    {
        if(ke.getSource()==t1)
        {
            int key=ke.getKeyChar();
            if((key<65 || key>90)&&(key<97 || key>122)&& key!=32)
            {
                showStatus("ONLY CHARACTERS && SPACE ALLOWED!!");
            }
        }
        if(ke.getSource()==t2)
        {
            int key=ke.getKeyChar();
            if(key<48 || key>57)
            {
                showStatus("ONLY NUMBERS ALLOWED!!");
            }
        }
    }
    public void keyReleased(KeyEvent ke)
    {
        if(ke.getSource()==t1)
        {
            int key=ke.getKeyChar();
            if((key<65 || key>90)&&(key<97 || key>122)&& key!=32)
            {
                //showStatus("ONLY CHARACTERS && SPACE ALLOWED!!");
                t1.setText(" ");
            }
            else
            {
                showStatus(" ");
            }
        }
        if(ke.getSource()==t2)
        {
            int key=ke.getKeyChar();
            if(key<48 || key>57)
            {
                //showStatus("ONLY NUMBERS ALLOWED!!");
                t2.setText(" ");
            }
            else
            {
                showStatus(" ");
            }
        }
    }
    public void keyTyped(KeyEvent ke)
    {
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            if((t1.getText()).length()!=0 && (t2.getText()).length()!=0)
            {
                l3.setText((t1.getText())+" "+(t2.getText()));
            }
            else
            {
                showStatus("Incorrect@@");
                l3.setText(" ");
            }
        }
    }
}
/*
<applet code=Applet_Awt_Label_Keylistener height=200 width=300>
</applet>
*/