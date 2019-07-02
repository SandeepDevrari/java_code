import java.util.*;  
public class JavaTreeMap_Example{  
    public static void main(String args[]){  
   
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
  
        hm.put(10,"Amit");  
        hm.put(1,"Vijay");  
        hm.put(23,"Rahul");  
  
        for(Map.Entry m:hm.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
        } 
        hm.remove(102);  
        System.out.println("Values after remove: "+ hm);
    }   
}  