public class Loop45{
    public Loop45(){
        int dec=21;
        String bin="";
        int rem,res=0;
        while(dec>0){
            res=dec/2;
            rem=dec%2;
            dec=res;
            bin=rem+bin;
        }
        System.out.println(bin);
    }
    public static void main(String[] args){
        Loop45 lp=new Loop45();
    }
}