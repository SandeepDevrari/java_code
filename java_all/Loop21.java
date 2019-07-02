public class Loop21{
    int c=3;
    Loop21(){
        int num=50;
        int temp=num;
        for(int i=1;i<=c;i++){
            num=num*temp;
        }
        System.out.println(num);
    }
    public static void main(String[] args){
        Loop21 lp=new Loop21();
    }
}