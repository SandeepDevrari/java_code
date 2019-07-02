import java.util.*;  
public class JavaLinkedHashMap_Example{  
    public static void main(String args[]){  
   
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
        hm.put(10,"Amit");  
        hm.put(1,"Vijay");  
        hm.put(12,"Rahul");  
  
        for(Map.Entry m:hm.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
        } 
        hm.remove(1);  
        System.out.println("Values after remove: "+ hm);
    }   
}  