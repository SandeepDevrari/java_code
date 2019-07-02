import java.util.Scanner;
public abstract class Abstract_Crypto
{
    private String str;
    private int digit;
    private String Eascii="",Dascii="";
    public void setString(String s)
    {
        str=s;
    }
    public void setDigit(int n)
    {
        digit=n;
    }
    public String getString()
    {
        return str;
    }
    public int getDigit()
    {
        return digit;
    }
    public String encrypt()
    {
        char ascii_char;
        int ascii_int;
        for(int i=0,j=1;i<str.length();i++,j++)
        {
            if(i%2==0)
            {
                ascii_int=(int)(str.substring(i,j).charAt(0));
                ascii_char=(char)(ascii_int+digit);
                //System.out.println(ascii_char);
                //Eascii=Eascii+(Character.toString((char)(((int)(str.substring(i,j).charAt(0)))+digit)));
                Eascii=Eascii+(Character.toString(ascii_char));
                //System.out.println(Eascii);
            }
            else
            {
                ascii_int=(int)(str.substring(i,j).charAt(0));
                ascii_char=(char)(ascii_int-digit);
                //System.out.println(ascii_char);
                Eascii=Eascii+(Character.toString(ascii_char));
                //System.out.println(Eascii);
                //Eascii=Eascii+(Character.toString((char)(((int)(str.substring(i,j).charAt(0)))-digit)));
            }
        }
        //System.out.println(Eascii);
        return Eascii;
    }
    public String decrypt()
    {
        char ascii_char;
        int ascii_int;
        //Dascii=new char[str.length()];
        //System.out.println(Eascii);
        for(int i=0,j=1;i<Eascii.length();i++,j++)
        {
            if(i%2==0)
            {
                ascii_int=(int)(Eascii.substring(i,j).charAt(0));
                ascii_char=(char)((ascii_int)-digit);
                //Dascii+=Character.toString((char)(((int)(Eascii.substring(i,j).charAt(0)))+digit));
                Dascii=Dascii+(Character.toString(ascii_char));
            }
            else
            {
                ascii_int=(int)(Eascii.substring(i,j).charAt(0));
                ascii_char=(char)((ascii_int)+digit);
                Dascii=Dascii+(Character.toString(ascii_char));
                //Dascii+=Character.toString((char)(((int)(Eascii.substring(i,j).charAt(0)))-digit));;
            }
        }
        return Dascii;
    }
}
class Crypto_Use extends Abstract_Crypto
{
    public static void main(String args[])
    {
        int n=0;
        String s=null;
        Crypto_Use cu=new Crypto_Use();
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter String: ");
        s=sr.next();
        System.out.print("\nEnter Digit: ");
        n=sr.nextInt();
        cu.setString(s);
        cu.setDigit(n);
        System.out.println("\nString: "+cu.getString());
        System.out.println("\nDigit: "+cu.getDigit());
        System.out.println("\nEncrypted String: "+cu.encrypt());
        System.out.println("");
        System.out.println("Decrypted String: "+cu.decrypt());
        System.out.println("");
    }
}