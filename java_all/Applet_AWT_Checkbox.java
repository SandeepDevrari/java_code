import java.awt.*;
import java.applet.*;
public class Applet_AWT_Checkbox extends Applet
{
    CheckboxGroup cbg;
    Checkbox ch1,ch2,ch3,ch4,ch5,ch6;
    Label l1,l2;
    Button b1,b2;
    public void init()
    {
        setBackground(Color.white);
        GridLayout G=new GridLayout(5,3);
        setLayout(G);
        l1=new Label("Gender");
        l2=new Label("Language");
        cbg=new CheckboxGroup();
        ch1=new Checkbox("Male",cbg,false);
        ch2=new Checkbox("Female",cbg,false);
        ch3=new Checkbox("English",false);
        ch4=new Checkbox("Hindi",false);
        ch5=new Checkbox("Tamil",false);
        ch6=new Checkbox("Other",false);
        b1=new Button("Save");
        b2=new Button("Clear");
        add(l1);
        add(ch1);
        add(ch2);
        add(l2);
        add(ch3);
        add(ch4);
        add(ch5);
        add(ch6);
        add(b1);
        add(b2);
    }
}
/*
<applet code=Applet_AWT_Checkbox height=400 width=700>
</applet>
*/