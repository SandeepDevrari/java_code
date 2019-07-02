import java.util.Hashtable;
public class JavaHashTable_Example{
    public JavaHashTable_Example(){
        Hashtable<Integer,Integer> hh=new Hashtable<>(10);
        hh.put(2,3);
        hh.put(3,3);
        hh.put(4,3);
        hh.put(1,4);
        hh.put(9,7);
        System.out.println(hh);
        //System.out.println(new Integer(1).hashCode());
        //System.out.println(new Integer(2).hashCode());
        //System.out.println(new Integer(3).hashCode());
    }
    public static void main(String[] args){
        new JavaHashTable_Example();
    }
}