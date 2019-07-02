package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.ArrayList;

public class Hakerrank_Problem2_1 {

    static int formingMagicSquare(int[][] s) {
    	int count=0,temp=0;
        
        //center
        if(s[1][1]!=5){
        	temp=5-s[1][1];
        	s[1][1]=s[1][1]+temp;
        	if(temp<0){
        		temp=temp*(-1);
        	}
        	count+=temp;
        }
        
        ArrayList<Integer> corner=new ArrayList<>();
        corner.add(2);
        corner.add(8);
        corner.add(4);
        corner.add(6);
        ArrayList<Integer> edge=new ArrayList<>();
        edge.add(1);
        edge.add(9);
        edge.add(3);
        edge.add(7);
        
        if(corner.contains(s[0][0]) || corner.contains(s[0][2])){
        	if(corner.contains(s[0][0])){}
        	if(corner.contains(s[0][2])){}
        }
        else if(corner.contains(s[2][0]) || corner.contains(s[2][2])){
        	//
        }
        
        /*
        
        
        
        
        
                for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                System.out.print(s[s_i][s_j]);
            }
            System.out.println("");
        }*/
       return count; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}

