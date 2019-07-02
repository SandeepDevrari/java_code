import java.util.Arrays;
import java.util.List;
public class Generic_Wildcards{
    public static int totalSum(List<? extends Number> l1){
        int sum=0;
        for(Number i:l1){
            sum+=i.intValue();
        }
        return sum;
    }
    
    public static void showIt(List<? super Integer> l1){
        System.out.println(l1);
    }
    public static void main(String[] args){
        List<Integer>l=Arrays.asList(4,5,6,7);
        showIt(l);
        List<Number>l1=Arrays.asList(64.2,57,67,47);
        showIt(l1);
    }
}
