import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class CharacterStream_Example
{
    FileReader in;
    FileWriter out;
    int c;
    void input() throws IOException
    {
        try
        {
            in=new FileReader("JavaIOString.txt");
            out=new FileWriter("JavaIOString2.txt");
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
        CharacterStream_Example cs=new CharacterStream_Example();
        cs.input();
    }
}