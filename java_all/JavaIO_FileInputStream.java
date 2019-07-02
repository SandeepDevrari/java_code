//import java.io.fileinputstream.*;
//import java.io.fileoutputstream.*;
import java.io.*;
public class JavaIO_FileInputStream
{
    FileInputStream in;
    FileOutputStream out;
    int ch=0;
    public JavaIO_FileInputStream()
    {
        try
        {
            in=new FileInputStream("D:\\Users\\DeVIL\\java\\JavaIOString.txt");
            out=new FileOutputStream("D:\\Users\\DeVIL\\java\\FileOutputStream.txt");
            while(ch!=-1)
            {
                ch=in.read();
                out.write(ch);
            }
        }
        catch(IOException io)
        {
            System.out.println(io.getMessage());
        }
        finally
        {
            try
            {
                in.close();
                out.close();
            }   
            catch(IOException io)
            {
                System.out.println(io.getMessage());
            }
        }
    }
    public static void main(String args[])
    {
        JavaIO_FileInputStream jio=new JavaIO_FileInputStream();
    }
}