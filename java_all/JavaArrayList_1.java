import java.util.ArrayList;
import java.util.ListIterator;

public class JavaArrayList_1{
    public static void main(String[] args){
        ArrayList al=new ArrayList<>();
        al.add(new Integer(10));
        al.add(new String("hhk"));
        al.add(0,new Character('f'));
        ListIterator it=al.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        al.clear();
        System.out.println(al);
        
        al.add(10);
        al.add("hhk");
        al.add(0,'f');
        
        System.out.println(al.contains("hhk"));
        al.add("okay");
        System.out.println(al.contains("10"));
        Object bl=al.clone();
        System.out.println(bl);
        System.out.println(al.isEmpty());
        System.out.println(al.set(0,90));
    }
}