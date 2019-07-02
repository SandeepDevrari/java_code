import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class ByteStream_Example
{
    FileInputStream in;
    FileOutputStream out;
    int c;
    void input() throws IOException
    {
        try
        {
            in=new FileInputStream("JavaIOString.txt");
            out=new FileOutputStream("JavaIOString1.txt");
            while((c=in.read())!=-1)
            {
                out.write(c);
                System.out.print(c+" ");
            }
            System.out.println(" ");
        }
        finally
        {
            in.close();
            out.close();
        }
    }
    public static void main(String args[]) throws IOException
    {
        ByteStream_Example bs=new ByteStream_Example();
        bs.input();
    }
}