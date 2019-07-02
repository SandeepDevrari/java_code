public class Loop12{
    int count,first,last;
    Loop12(){
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
                first=c;
            }else if(count==1)
            {
                last=c;
            }
            count--;
            p=p/10;
        }
        System.out.println(first+last);
        
    }
    public static void main(String[] args){
        Loop12 lp=new Loop12();
    }
}