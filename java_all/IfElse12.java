
public class IfElse12{
   IfElse12(){
        int i=7;
        if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
        {
            System.out.println("31");
        }
        else if(i==2){
            System.out.println("28-29");
        }
        else if(i==4 || i==6 || i==9 || i==11){
            System.out.println("30");
        }
    }
    public static void main(String[] args)
    {
        IfElse12 ie=new IfElse12();
    }
}