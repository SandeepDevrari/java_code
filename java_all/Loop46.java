public class Loop46{
    public Loop46(){
        int dec=21;
        String bin="";
        int rem,res=0;
        while(dec>0){
            res=dec/8;
            rem=dec%8;
            dec=res;
            bin=rem+bin;
        }
        System.out.println(bin);
    }
    public static void main(String[] args){
        Loop46 lp=new Loop46();
    }
}