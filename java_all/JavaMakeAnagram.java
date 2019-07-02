package hackerrank;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class JavaMakeAnagram{
    public static int numberNeeded(String first, String second) {
        ConcurrentHashMap<Character,Integer> map=toMap(first.toLowerCase());
        ConcurrentHashMap<Character,Integer> map2=toMap(second.toLowerCase());
        int remov=0;
        try{
        for(Map.Entry e:map.entrySet()){
            if(map2.containsKey(e.getKey())){
                if(map2.get(e.getKey())!=(Integer)(e.getValue())){
                    if(map2.get(e.getKey())>(Integer)(e.getValue())){
                        remov+=map2.get(e.getKey())-(Integer)(e.getValue());
                    }
                    else if(map2.get(e.getKey())<(Integer)(e.getValue())){
                        remov+=(Integer)(e.getValue())-map2.get(e.getKey());
                    }
                }
                map2.remove(e.getKey());
            }
            else{
                remov+=(Integer)(e.getValue());
            }
            map.remove(e.getKey());
        }
        if(!map2.isEmpty()){
            for(Map.Entry v:map2.entrySet()){
                remov+=(Integer)(v.getValue());
            }
        }
        }
        catch(Exception ep){
        	ep.printStackTrace();
        }
            map=null;
            map2=null;
            return remov;
    }
    public static ConcurrentHashMap<Character,Integer> toMap(String str){
        char[] temp=str.toCharArray();
        ConcurrentHashMap<Character,Integer> tempMap=new ConcurrentHashMap<>();
        for(char c:temp){
            if(!tempMap.containsKey(c)){
                tempMap.put(c,1);
            }
            else{
                tempMap.replace(c,(tempMap.get(c)+1));
            }
        }
        return tempMap;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

