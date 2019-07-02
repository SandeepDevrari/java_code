public class Loop13{
    int count,first,last;
    Loop13(){
        int i=93450,p,m;
        p=i;
        m=i;
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
        if(first>last){
            int gap=first-last;
            m=m-gap;
            for(int d=1;d<y;d++){
                gap=gap*10;
            }
            m=m+gap;
        }
        else if(first<last){
            int gap=last-first;
            m=m+gap;
            for(int d=1;d<y;d++){
                gap=gap*10;
            }
            m=m-gap;
        }
        else{
            //do nothing
        }
        
        System.out.println(m);
    }
    public static void main(String[] args){
        Loop13 lp=new Loop13();
    }
}