public class Loop18{
    int prod;
    Loop18(){
        int i=334422;
        int p=0,t=0,cont;
        while(i!=0){
            p=i;
            prod=i%10;
            i=i/10;
            cont=0;
            while(p!=0){
                t=p%10;
                p=p/10;
                if(t==prod){
                    cont++;
                }
            }
            System.out.println(prod+" frequency: "+cont);
        }
    }
    public static void main(String[] args){
        Loop18 lp=new Loop18();
    }
}