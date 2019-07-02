public class ProblemWithQueen{
    public ProblemWithQueen(String s){
        if(s.equals("Queen") || s.equals("queen")){
            try{
                throw new ProblemWithQueenException();
            }
            catch(ProblemWithQueenException pq){
                System.out.println(pq.getMessage());
            }
        }
        else{
            System.out.println("Bingo!!, You win");
        }
    }
    public static void main(String[] args){
        try{
            ProblemWithQueen pq=new ProblemWithQueen(args[0]);
        }
        catch(Exception pq){
            System.out.println(pq.getMessage());
        }
    }
}