public class ProbWithSevenException extends Exception
{
    private int n;
    public ProbWithSevenException(int num)
    {
        n=num;
    }
    public String toString()
    {
        return("Sorry you can't give 7 or multiple of 7 as input :: "+n);
    }


}