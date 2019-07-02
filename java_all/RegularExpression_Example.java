import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpression_Example {

    public static void main(String[] args){
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) {

            Pattern pattern = 
            Pattern.compile(console.readLine("%nEnter your regex: "));

            Matcher mat = 
            pattern.matcher(console.readLine("Enter input string to search: "));

            boolean found = false;
            while (mat.find()) {
                console.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    mat.group(),
                    mat.start(),
                    mat.end());
                found = true;
            }
            if(!found){
                console.format("No match found.%n");
            }
        }
    }
}