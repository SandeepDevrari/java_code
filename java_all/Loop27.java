public class Loop27{
    Loop27(){
        int num=10;
        while(num>1){
            for(int i=2;i<=num;i++)
            {
                if(num%i==0 && i!=num)
                {
                    //
                    break;
                }
                else if(i==num)
                {
                    System.out.print(num+" ");
                    break;
                }
            }
            num--;
        }
    }
    public static void main(String[] args){
        Loop27 lp=new Loop27();
    }
}