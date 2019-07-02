public class Pattern_Problem{
    public Pattern_Problem(int n){
        int num=1;
        String str="";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                str=(num++)+str;
                //System.out.print(num++);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Pattern_Problem pp=new Pattern_Problem(4);
    }
}