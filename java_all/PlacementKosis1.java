/* this is test series of solving problems related to company placement*/
import java.util.Scanner;

public class PlacementKosis1{
    public PlacementKosis1(){
        System.out.print("Size of array: ");
        Scanner scr=new Scanner(System.in);
        int sz=scr.nextInt();
        String[] arr=new String[sz];
        String[] rep=new String[sz];
        System.out.println("Enter Charecters-");
        arr[0]=scr.next();
        String cr=null;
        
        for(int i=1,j=0;i<sz;i++)
        {
            boolean temp=true;
            cr=scr.next();
            for(int b=0;b<i;b++)
            {
                if(cr.equals(arr[b])){
                    temp=false;
                    break;
                }
            }
            if(temp)
                arr[i]=cr;
            else{
                boolean loc=true;
                for(int c=0;c<j;c++){
                    if(cr.equals(rep[c])){
                        loc=false;
                        break;
                    }
                }
                if(loc){
                    rep[j]=cr;
                    //System.out.println("*"+j+"*"+cr);
                    j++;
                }
                    
            }
        }
        System.out.print("Repleating Characters: ");
        for(String c: rep){
            if(c==null)
                break;
            System.out.print(c+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        PlacementKosis1 ol=new PlacementKosis1();
    }
}