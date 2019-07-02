public class IfElse2{
    IfElse2(int i,int j,int k){
        if(i>j && i>k)
        {
            System.out.println("maximum: "+i);
        }
        else if(j>i && j>k){
            System.out.println("maximum: "+j);
        }
        else if(k>i && k>j){
            System.out.println("maximum: "+k);
        }
    }
    public static void main(String[] args)
    {
        IfElse2 ie=new IfElse2(8,5,7);
    }
}