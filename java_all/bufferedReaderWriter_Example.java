import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class Buffered_Example
{
    //FileReader in;
    //FileWriter out;
    BufferedReader br;
    BufferedWriter bw;
    String c;
    void input() throws IOException
    {
        try
        {
            br=new BufferedReader(new FileReader("JavaIOString.txt"));
            bw=new BufferedWriter(new FileWriter("JavaIOString2.txt"));
            while((c=br.readLine())!=null)
            {
                bw.writeLine(c);
                System.out.print(c+" ");
            }
            System.out.println(" ");
        }
        finally
        {
            br.close();
            bw.close();
        }
    }
    public static void main(String args[]) throws IOException
    {
        Buffered_Example be=new Buffered_Example();
        be.input();
    }
}