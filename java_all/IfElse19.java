
public class IfElse19{
    IfElse19(){
        int P=80,C=80,B=80,M=80,Camp=80;
        int maxMarks=100;
        int total=P+C+B+M+Camp;
        
        int percent=(total*100)/(maxMarks*5);
        
        if(percent>=90)
        {
            System.out.println("Grade A");
        }else if(percent>=80){
            System.out.println("Grade B");
        }else if(percent>=70){
            System.out.println("Grade C");
        }else if(percent>=60){
            System.out.println("Grade D");
        }else if(percent>=40){
            System.out.println("Grade E");
        }else if(percent<40)
        {
            System.out.println("Grade F");
        }
    }
    public static void main(String[] args)
    {
        IfElse19 ie=new IfElse19();
    }
}