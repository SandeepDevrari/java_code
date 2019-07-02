//import java.util.Arrays.*;
class ArrayCopy
{
    int[] arry1={1,2,3,4,5};
    int arry2[]=new int[5];
    void output()
    {
        System.arraycopy(arry1,0,arry2,0,5);
        System.out.print("Array 1: ");
        for(int i : arry1)
        {
            System.out.print(i+" ");
        }
        System.out.print("\nArray 2: ");
        for(int i : arry2)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        int arry3[]=java.util.Arrays.copyOfRange(arry1,0,5);
        System.out.print("Array 3: ");
        for(int i : arry3)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        new ArrayCopy().output();
    }
}