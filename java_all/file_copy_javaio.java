import java.io.*;
class JavaIOFileCopy
{
    BufferedReader br;
    InputStreamReader isr;
    InputStream file1,file2;
    void Input() throws Exception
    {
        String str=null;
        file1=new FileInptStream("D:\\Users\\DeVIL\\java\\JavaIOString.txt");
        file2=new FileInptStream("D:\\Users\\DeVIL\\java\\JavaIOString1.txt");
        isr=new InputStreamReader(file1);
        br=new BufferedReader(isr);
        str=br.readLine();
        output(str);
    }
    void output(String str) throws Exception
    {
        
    }
    public static void main(String args[]) throws Exception
    {
        JavaIOFileCopy filecopy=new JavaIOFileCopy();
        filecopy.input();
        filecopy.output();
    }
}