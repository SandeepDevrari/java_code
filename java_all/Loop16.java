public class Loop16{
    int prod;
    Loop16(){
        int i=61114;
        while(i!=0){
            prod=(prod*10)+(i%10);
            i=i/10;   
        }
        System.out.println(prod);
        
    }
    public static void main(String[] args){
        Loop16 lp=new Loop16();
    }
}