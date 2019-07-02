import java.io.*;
class JavaIOFile
{
    InputStreamReader isr;
    BufferedReader br;
    String str;
    InputStream file1;
    void input() throws Exception
    {
        file1=new FileInputStream("D:\\Users\\DeVIL\\java\\JavaIOString.txt");
        isr=new InputStreamReader(file1);
        br=new BufferedReader(isr);
        str=br.readLine();
        output();
    }
    void output()
    {
        System.out.println(str);
    }
    public static void main(String args[]) throws Exception
    {
        JavaIOFile file=new JavaIOFile();
        file.input();
    }
}