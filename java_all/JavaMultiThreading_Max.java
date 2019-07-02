1package hackerrank;
import java.math.*;
public class JavaMultiThreading_Max{
    private static class JavaMultiThreading_Max_Private extends Thread{
        int max=Integer.MIN_VALUE;
        int[] arry;
        public JavaMultiThreading_Max_Private(int[] arry){
            this.arry=arry;
        }
        public void run(){
            for(int i:arry){
                max=Math.max(max,i);
            }
        }
        public int getMax(){
            return max;
        }
    }
    public static void main(String[] args){
        JavaMultiThreading_Max_Private[] myThreads=new JavaMultiThreading_Max_Private[10];
        int[][] biggerMatrix={
                                {0,1,2,3,4},{5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19},{20,211,22,23,24},{25,26,27,28,29},{30,31,32,33,34},{35,36,37,38,39},{40,41,42,43,44},{45,46,47,48,49}
                            };
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<10;i++){
                myThreads[i]=new JavaMultiThreading_Max_Private(biggerMatrix[i]);
                myThreads[i].start();
            }
            
            try{
                for(JavaMultiThreading_Max_Private privateThread:myThreads){
                    privateThread.join();
                    max=Math.max(max,privateThread.getMax());
                }
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Max "+max);
    }
}
