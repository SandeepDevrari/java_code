import java.util.Scanner;
public class JavaREGEXProblem_name{
    private static final Scanner scan = new Scanner(System.in);
    
    static class UsernameValidator{
    	public static final String regularExpression = "^[a-zA-Z]([a-zA-Z,0-9,_]){7,29}";
	}
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
