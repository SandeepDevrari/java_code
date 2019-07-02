import java.util.*;

 public class JavaHashMap_Example{
        public static void main(String args[]){
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(1, "Value1");
        hashmap.put(2, "Value2");
        hashmap.put(3, "Value3");
        hashmap.put(4, "Value4");
        hashmap.put(5, "Value5");
        System.out.println("HashMap contains: "+hashmap);
        String var= hashmap.get(2);
        System.out.println("Value at key 2 is: "+var);
    
        hashmap.remove(3);
        System.out.println("Map keys and values after removal:");
        Set set = hashmap.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.print("Key is: "+pair.getKey() + " and Value is: ");
            System.out.println(pair.getValue());
        }
        System.out.println("Size of HashMap: " + hashmap.size());
        System.out.println(hashmap.containsKey(4));
        System.out.println(hashmap.containsValue("hell"));
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.isEmpty());
        System.out.println(hashmap.values());
  }
}