public class Loop17{
    int prod;
    Loop17(){
        int i=42125;
        int p=i;
        while(i!=0){
            prod=(prod*10)+(i%10);
            i=i/10;
        }
        if(prod==p){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
        
        
    }
    public static void main(String[] args){
        Loop17 lp=new Loop17();
    }
}