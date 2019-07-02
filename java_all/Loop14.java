public class Loop14{
    int sum;
    Loop14(){
        int i=600006;
        while(i!=0){
            sum=sum+(i%10);
            i=i/10;   
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args){
        Loop14 lp=new Loop14();
    }
}