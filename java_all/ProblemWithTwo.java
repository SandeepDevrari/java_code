public class ProblemWithTwo{
    public ProblemWithTwo(int number)throws ProbWithTwoException{
        try{
            if(number%2==0){
                throw new ProbWithTwoException();
            }
            else{
                System.out.println("Bingo!!");
            }
        }
        catch(ProbWithTwoException two){
            System.out.println(two.getMessage());
        }
    }
    public static void main(String[] args){
        try{
            ProblemWithTwo pwt=new ProblemWithTwo(Integer.parseInt(args[0]));
        }catch(Exception r){}
    }
}