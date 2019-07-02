import javax.swing.*;
import java.awt.*;
//import java.awt.image.BufferedImage;
//import javax.imageio.*;
//import java.io.*;
public class Ewallet{
    private JFrame frame;
    private CardLayout cardLay;
    private JPanel cardPanel,panel1;
    private JLabel drop,wallet,wallet1;
  //  private BufferedImage image;
    //private JButton drop; 
    //private DropShadow shadow;
    protected Ewallet()
    {
        frame=new JFrame("EWALLET");
        cardLay=new CardLayout();
        cardPanel=new JPanel(cardLay);
        panel1=new JPanel();
        panel1.setBackground(Color.white);
        panel1.setSize(930,750);
        panel1.setVisible(true);
        panel1.setLayout(null);
        /*try
        {
            image = ImageIO.read(new File("ewall\\drop.png"));
            repaint();
        }
        catch(IOException io)
        {
            System.out.println(io.getMessage());
        }*/
        //repaint();
        drop=new JLabel(new ImageIcon("ewall\\drop.png"));
        drop.setBounds(340,230,256,256);
        wallet=new JLabel(new ImageIcon("ewall\\ewallet1.png"));
        wallet.setBounds(40,550,128,128);
        //drop.setBorder(BorderFactory.createEmptyBorder());
        //drop.setContentAreaFilled(false);
        wallet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wallet.repaint();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wallet=new JLabel(new ImageIcon("ewall\\ewallet1.png"));
                wallet.setBounds(40,550,128,128);
            }
        });
        panel1.add(drop);
        panel1.add(wallet);
        cardPanel.add(panel1,"p1");
        cardPanel.setSize(950,750);
        cardPanel.setVisible(true);
        frame.add(cardPanel);
        frame.setSize(950,750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        Ewallet wall=new Ewallet();
    }
    
     public void paint(Graphics g)
    {
        //wallet=new JLabel(new ImageIcon("ewall\\ewallet.png"));
        wallet.setBounds(40,550,256,256);
    }
}