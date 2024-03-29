 /* Java program to solve N Queen Problem using backtracking */

import java.io.*;
import java.util.*;

public class NQueenProblem {
    public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[][]= new int[n][n];
	       if (solveNQUtil(arr, 0,n) == false)  
                System.out.print("Solution does not exist");
            else
            {
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    System.out.print(arr[i][j]+" ");
                    System.out.println();
                }
                
            }
	}
	 static boolean isSafe(int board[][], int N,int row, int col)
	{
		int i, j;
		for (i = 0; i < col; i++)
			if (board[row][i] == 1)
				return false;
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if (board[i][j] == 1)
				return false;
 
		for (i = row, j = col; j >= 0 && i < N; i++, j--)
			if (board[i][j] == 1)
				return false;

		return true;
	}

	static boolean solveNQUtil(int board[][], int col,int N)
	{
	 
		if (col >= N)
			return true;
      for (int i = 0; i < N; i++) 
		{
		 
			if (isSafe(board,N, i, col))
			{
				 
				board[i][col] = 1;
 
				if (solveNQUtil(board, col + 1,N) == true)
					return true;
 
				board[i][col] = 0;  
			}
		}
   return false;
	}
}
 
