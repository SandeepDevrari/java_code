public class Loop26{
    Loop26(){
        int num=10;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0 && i!=num)
            {
                System.out.println("Not prime");
                break;
            }
            else if(i==num)
            {
                System.out.println("prime");
                break;
            }
        }
    }
    public static void main(String[] args){
        Loop26 lp=new Loop26();
    }
}