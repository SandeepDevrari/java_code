package hackerrank;
import java.util.Scanner;
import java.util.regex.*;

public class JavaPatternException{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
       boolean pc=false;
      while(testCases>0){
          pc=false;
         String pattern = in.nextLine();
          try{
              Pattern pet=Pattern.compile(pattern);
              
          }
          catch(PatternSyntaxException pp){
              System.out.println("Invalid");
              pc=true;
          }
          if(!pc){
              System.out.println("Valid");
          }
          testCases--;
      }
   }
}
