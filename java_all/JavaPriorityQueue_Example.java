import java.util.PriorityQueue;
import java.util.Comparator;
public class JavaPriorityQueue_Example{
    public static void main(String[] args){
        ByOrder bo=new ByOrder();
        PriorityQueue<Integer> pq=new PriorityQueue<>(10,bo);
        pq.add(3);
        pq.add(1);
        pq.add(5);
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    static class ByOrder implements Comparator<Integer>{
        @Override
        public int compare(Integer x,Integer y){
            if(x>y){
                return -1;
            }
            else if(x<y){
                return 1;
            }
            return 0;
        }
    }
}