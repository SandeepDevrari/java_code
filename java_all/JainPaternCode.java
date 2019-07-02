public class JainPaternCode{
    public JainPaternCode(int num){
        int tempNum=1,l=1,temp=0;
        while(tempNum<(num-2)){
            if(tempNum<(num-2)/2){
                for(int i=0;i<temp;i++){
                    System.out.print(l);
                    l++;
                }
                temp++;
            }else{
                for(int i=0;i<temp;i++){
                    System.out.print(l);
                    l--;
                }
                temp--;
            }
            tempNum++;
            System.out.println("");
        }
    }
    public static void main(String args[]){
        JainPaternCode j=new JainPaternCode(10);
    }
}