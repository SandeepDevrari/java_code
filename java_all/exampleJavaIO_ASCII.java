import java.io.*;
class JavaIOASCII
{
    InputStreamReader isr;
    BufferedReader br;
    int ascii_int;
    void input() throws IOException
    {
        char con='y';
        String ch=null;
        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        while(con=='y' || con=='Y')
        {
            System.out.println("Enter Character:");
            ch=br.readLine();
            ascii_int=(int)(ch.charAt(0));
            output();
            System.out.println("Want to Continue(Y/N):");
            con=(br.readLine()).charAt(0);
        }
    }
    void output() throws IOException
    {
        //int ch1=0;
        System.out.println("ASCII Value : "+ascii_int);
    }
    public static void main(String args[]) throws IOException
    {
        JavaIOASCII ascii=new JavaIOASCII();
        ascii.input();
    }
}