import java.io.*;
public class JavaIO_CharacterStream
{
    FileReader in;
    FileWriter out;
    int ch=0;
    public JavaIO_CharacterStream()
    {
        try
        {
            in=new FileReader("D:\\Users\\DeVIL\\java\\JavaIOString.txt");
            out=new FileWriter("D:\\Users\\DeVIL\\java\\FileReader_Writer.txt");
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
        JavaIO_CharacterStream jcs=new JavaIO_CharacterStream();
    }
}