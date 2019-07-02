public class Loop11{
    int count;
    Loop11(){
        int i=13459,p;
        p=i;
        while(i!=0){
            //System.out.println(i%10);
            i=i/10;
            count++;
        }
        int c=0,y=count;
        while(count!=0)
        {
            c=p%10;
            if(count==y)
            {
                System.out.println("first: "+c);
            }else if(count==1)
            {
                System.out.println("Last: "+c);
            }
            count--;
            p=p/10;
        }
        //System.out.println(count);
        
    }
    public static void main(String[] args){
        Loop11 lp=new Loop11();
    }
}