public class Loop10{
    int count;
    Loop10(){
        int i=13455;
        while(i!=0){
            //System.out.println(i%10);
            i=i/10;
            count++;
        }
        System.out.println(count);
        
    }
    public static void main(String[] args){
        Loop10 lp=new Loop10();
    }
}