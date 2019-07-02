public class Loop28{
    Loop28(){
        int num=10;
        int sum=0;
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
                    sum=sum+num;
                    //System.out.print(num+" ");
                    break;
                }
            }
            num--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Loop28 lp=new Loop28();
    }
}