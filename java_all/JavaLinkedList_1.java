import java.util.*;
public class JavaLinkedList_1{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.add("S");
        System.out.println(list.size());
        list.addFirst("okay");
        list.addLast('g');
        System.out.println(list);
        Iterator e=list.descendingIterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
        
        System.out.println("peek"+list.peek());
        list.clear();
        list.add(0,"Element");
        Collection collection = new ArrayList();

        collection.add("jj");
        collection.add("java");
        collection.add("Android");
        list.addAll(collection);
        System.out.println("Linked List:"+list);
        System.out.println("Linked List:" + list);
        LinkedList list2 = (LinkedList)list.clone();
        System.out.println("Linked List 2:" + list2);
        System.out.println("List contains 'java':" +list.contains("java"));
        System.out.println("Element at index 3 :" + list.get(2));
        System.out.println("Index for Coffee:" + list.indexOf("Android"));
        System.out.println("Last Index for Android: " + list.lastIndexOf("Android"));
        System.out.println("Element to be removed:" +list.remove(3));
        System.out.println("First element:" + list.removeFirst());
        System.out.println("Last element:" + list.removeLast());
        System.out.println("Object to be replaced:" + list.set(3, "roid"));
        Object[] array = llist.toArray();for(int i=0;i<list.size(); i++) {
        System.out.println("Array:" + array[i]);

    }
    }
}