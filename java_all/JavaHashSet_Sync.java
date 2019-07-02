package javaCollection;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class JavaHashSet_Sync{
    static Set<Integer> set;
    public JavaHashSet_Sync(){
        set=Collections.synchronizedSet(new HashSet<>());
    }
    public static class Sync_Class implements Runnable{
        ArrayList<Integer> al;
        public Sync_Class(ArrayList<Integer> al){
            this.al=al;
        }
        @Override
        public void run(){
            synchronized(set){
                set.addAll(al);
                Iterator<Integer> iter=set.iterator();
                System.out.println(Thread.currentThread().getName());
                while(iter.hasNext()){
                    System.out.println(iter.next());
                }
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(9);
        al.add(6);
        al.add(7);
        al.add(8);
        ArrayList<Integer> l=new ArrayList<>();
        l.add(11);
        l.add(16);
        l.add(17);
        l.add(81);
        new JavaHashSet_Sync();
        Thread t1=new Thread(new Sync_Class(al));
        Thread t2=new Thread(new Sync_Class(l));
        t1.start();
        t2.start();
    }
}