import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
class Array{
    Array()
    {
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        //int arr[]=new int[5];//={1,2,3,4,5};
        Scanner s=new Scanner(System.in);
        for(int i=0;i<7;i++)
        {
        System.out.print("Enter data: ");
        //arr[i]=s.nextInt();
        int u=s.nextInt();
        arr2.add(u);
        System.out.println(" ");
        }
        //System.out.println(Arrays.toString(arr));
        /*for(int i=0;i<arr2.size();i++)
            System.out.print(arr2.get(i)+" ");
        System.out.println(" ");*/
        for(int i:arr2)
            System.out.print(arr2.get(i)+" ");
        System.out.println(" ");
    }
    public static void main(String arags[])
    {
        Array o=new Array();
    }
}