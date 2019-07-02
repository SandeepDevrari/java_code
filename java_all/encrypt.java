interface Encrypt
{
    public void encrypt(String any_str);
}
class Encrypt_Class_1 implements Encrypt
{
    public void encrypt(String any_str)
    {
        char ascii_char;
        int ascii_int;
        for(int i=0,j=1;j<any_str.length()+1;i++,j++)
        {
            //ch=Character.parseChar(any_str.substring(i,j));
            ascii_char=any_str.substring(i,j).charAt(0);
            //System.out.println(ch);
            ascii_int=((int)ascii_char)+2;
            ascii_char=(char)ascii_int;
            System.out.print(ascii_char);
        }
        System.out.println(" ");
    }
}
class Encrypt_Class_2 implements Encrypt
{
    public void encrypt(String any_str)
    {
        char ascii_char;
        int ascii_int;
        for(int i=0,j=1;j<any_str.length()+1;i++,j++)
        {
            //ch=Character.parseChar(any_str.substring(i,j));
            ascii_char=any_str.substring(i,j).charAt(0);
            //System.out.println(ch);
            ascii_int=((int)ascii_char)-2;
            ascii_char=(char)ascii_int;
            System.out.print(ascii_char);
        }
        System.out.println(" ");
    }
}
class Encrypt_Class_3 implements Encrypt
{
    public void encrypt(String any_str)
    {
        char ascii_char;
        int ascii_int;
        for(int i=0,j=1;j<any_str.length()+1;i++,j++)
        {
            //ch=Character.parseChar(any_str.substring(i,j));
            ascii_char=any_str.substring(i,j).charAt(0);
            //System.out.println(ch);
            ascii_int=((int)ascii_char)-1;
            ascii_char=(char)ascii_int;
            System.out.print(ascii_char);
        }
        System.out.println(" ");
    }
}
class EncryptMainClass
{
    public static void main(String args[])
    {
        Encrypt_Class_3 obj3=new Encrypt_Class_3();
        System.out.println("\nEncrypted:");
        obj3.encrypt(args[0]);
        Encrypt_Class_2 obj2=new Encrypt_Class_2();
        obj2.encrypt(args[0]);
        Encrypt_Class_1 obj1=new Encrypt_Class_1();
        obj1.encrypt(args[0]);
        System.out.println("");
    }
}