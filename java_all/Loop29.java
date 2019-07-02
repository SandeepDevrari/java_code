public class Loop29{
    int i=2;
    Loop29(){
        int num=26;
        while(num>1){
            if(num%i==0){
                num=num/i;
                System.out.print(i+" ");
            }
            else{
                
                i++;
            }
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Loop29 lp=new Loop29();
    }
}