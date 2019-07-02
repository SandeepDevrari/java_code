import java.io.*;
import java.util.*;

class GFG {
    
    private void input()
    {
        try{
        Scanner s=new Scanner(System.in);
        int[] arr;
        System.out.print("Enter T:");
        int T=s.nextInt();//number of test case
        if(T>=1&&T<=200)
        {
            for(int i=1;i<=T;i++)
            {
                System.out.print("Enter N:");
                int N=s.nextInt();//size in each case
                if(N>=1&&N<=100)
                {
                    arr=new int[N];
                    System.out.println("Enter :");
                    for(int j=0;j<N;j++)
                        arr[j]=s.nextInt();
                    logic(arr,N);
                }
                else
                {
                    System.out.println("NOT FOLLOW:1<=N<=100");
                }
            }
        }
        else
        {
            System.out.println("NOT FOLLOW:1<=T<=200");
        }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    private void logic(int arr[],int N)
    {
        int temp=0;
        int c=1;
        while(N>1)
        {
            temp=arr[N-1];
            for(int i=N-1;i>0;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            if(c<N)
            {
                //int b=N-c;
                for(int k=N-c;k<N-1;k++)
                {
                    arr[k]=arr[k+1];
                }
            }
            else
            {
                for(int k=0;k<N;k++)
                    arr[k]=arr[k+1];
            }
            N--;
            c++;
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println(arr[0]);
    }
	public static void main (String[] args) {
		 GFG obj=new GFG();
	    obj.input();
	}
}