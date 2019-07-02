import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to your array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings. Your task is to print the type number of that bird and if two or more types of birds are equally common, choose the type with the smallest ID number.

For example, assume your bird sightings are of types arr=[1,1,2,2,3] . There are two each of types  and , and one sighting of type . Pick the lower of the two types seen twice: type 1.*/

public class HakerProblem_001 {

    static boolean isFirst=true;
    static Integer oldNum=0,count=0,storeCount=0,storeNum=0;
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        /*
        *1-sort arr (ascending order)
        *2-LOOP from i=0 to i<arr.size
        *3-    IF firstTime THEN
        *4-        oldNum=arr[i]
        *5-    ELSE
        *6-        IF arr[i]==oldNum THEN
        *7-            count=count+1
        *8-        ELSE
        *9-            IF storeCount<=count THEN
        *10-               IF storeCount==count THEN
        *11-                   IF oldNum<storeNum THEN
        *11-                       store the count(storeCount) and oldNum(storeNum)
        *12-               ELSE IF oldNum>storeNum THEN
        *13-                   store the count(storeCount) and oldNum(storeNum)
        *10-               ELSE IF oldNum==storeNum THEN
        *11-                   store the count(storeCount) and oldNum(storeNum) END
        *12-           oldNum=arr[i],count=1
        *13-   END
        *14-   IF i isLastIndex THEN
        *15-       move to step 9 to step 11
        *14-LOOP END
        *15-RETURN storeNum*/

        List<Integer> arr1=new ArrayList(arr);
        Collections.sort(arr);
        String f="start ";
        for(Integer i=0; i<arr.size();i++){
            f+=arr1.get(i)+" ";
            if(isFirst){
                oldNum=arr.get(i);
                count=1;
                storeNum=arr.get(i);
                storeCount=1;
                isFirst=false;
            }else{
                if(arr.get(i)==oldNum){
                    count++;
                }else{
                    crossCheck();
                    oldNum=arr.get(i);
                    count=1;
                }
            }
            if(i==(arr.size()-1)){
                //last item in list
                crossCheck();
            }
        }
        System.out.println(f+" end");
        return storeNum;
    }

    static void store(){
        storeNum=oldNum;
        storeCount=count;
    }

    static void crossCheck(){
        if(storeCount<=count){
            if(storeCount==count){
                if(oldNum<=storeNum){
                    store();
                }
            }else if((oldNum>storeNum) || (storeNum==oldNum)){
                store();
            }
        }
        System.out.println("store count-"+storeCount+"\n count-"+count+"\n storeNum-"+storeNum+"\noldNum"+oldNum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hackerrank_001_result.txt"));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        
        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
