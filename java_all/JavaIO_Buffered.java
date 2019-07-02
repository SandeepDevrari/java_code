import java.io.*;
public class JavaIO_Buffered
{
    FileInputStream ins;
    FileOutputStream outs;
    BufferedInputStream in;
    BufferedOutputStream out;
    BufferedReader bin;
    BufferedWriter bout;
    public JavaIO_Buffered()
    {
        int str;
        try
        {
            ins=new FileInputStream("D:\\Users\\DeVIL\\java\\JavaIOString.txt");
            outs=new FileOutputStream("D:\\Users\\DeVIL\\java\\BufferedInputStream.txt");
            in=new BufferedInputStream(ins);
            out=new BufferedOutputStream(outs);
            bin=new BufferedReader(new FileReader("D:\\Users\\DeVIL\\java\\JavaIOString.txt"));
            bout=new BufferedWriter(new FileWriter("D:\\Users\\DeVIL\\java\\BufferedWriter.txt"));
            while((str=in.read())!=-1)
            {
                //str=in.read();
                out.write(str);
            }
            while((str=bin.read())!=-1)
            {
                bout.write(str);
            }
        }
        catch(IOException io)
        {
            System.err.println(io.getMessage());
        }
    }
    public static void main(String args[])
    {
        JavaIO_Buffered jio=new JavaIO_Buffered();
    }
}