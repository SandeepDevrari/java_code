import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
//import javax.swing.*;
public class LoadImageApp extends Frame {
          
    BufferedImage img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public LoadImageApp() {
       try {
           img = ImageIO.read(new File("fire.png"));
       } catch (IOException e) {
       }

    }
    public static void main(String[] args)
    {
        LoadImageApp la=new LoadImageApp();
        la.setVisible(true);
        la.setSize(600,600);
    }
}