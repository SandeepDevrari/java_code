public class Loop15{
    int prod=1;
    Loop15(){
        int i=61114;
        while(i!=0){
            prod=prod*(i%10);
            i=i/10;   
        }
        System.out.println(prod);
        
    }
    public static void main(String[] args){
        Loop15 lp=new Loop15();
    }
}