public class Loop23{
    int i=2;
    Loop23(){
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
        Loop23 lp=new Loop23();
    }
}