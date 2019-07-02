
public class IfElse20{
    int HRA,DA;
    IfElse20(){
        int salary=30000;
        
        if(salary<=10000){
            HRA=20;
            DA=80;
        }
        else if(salary<=20000)
        {
            HRA=25;
            DA=90;
        }
        else{
            HRA=30;
            DA=95;
        }
        int gross=salary+HRA+DA;
        System.out.println("Gross Salary: "+gross);
    }
    public static void main(String[] args)
    {
        IfElse20 ie=new IfElse20();
    }
}