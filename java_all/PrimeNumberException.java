public class PrimeNumberException extends Exception
{
    private int n;
    public PrimeNumberException(int num)
    {
        n=num;
    }
    
    public String toString()
    {
        return ("Error\nNumber "+n+" is Prime@@");
    }
}