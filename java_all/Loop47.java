public class Loop47{
    public Loop47(){
        int dec=213;
        String hex="";
        int rem,res=0;
        while(dec>0){
            res=dec/16;
            rem=dec%16;
            dec=res;
            if(rem>9){
                if(rem==10){
                    hex="A"+hex;
                }
                else if(rem==11){
                    hex="B"+hex;
                }
                else if(rem==12){
                    hex="C"+hex;
                }
                else if(rem==13){
                    hex="D"+hex;
                }
                else if(rem==14){
                    hex="E"+hex;
                }
                else if(rem==15){
                    hex="F"+hex;
                }
            }
            else{
               hex=rem+hex; 
            }
            
        }
        System.out.println(hex);
    }
    public static void main(String[] args){
        Loop47 lp=new Loop47();
    }
}