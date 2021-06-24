/* Given matrix M[R][C] make a new matrix MN[R][C] having  MN[i][j] element is the sum of all previous element if M[i][j] 

Example 
Input 1 :-
 N=2
 1 2 
 3 4

Output 1 :-
 1 3
 4 10

Input 2 :-
 N=3

1 2 3 
4 5 6  
7 8 9  

Output 2 :-
1 3 6 
5 12 21 
12 27 45   */

solution :-

public void Previous_Sum(int arr[][],int n)
{
    
      for(int i=1;i<n;i++)
	 {
	     arr[i][0]+=arr[i-1][0];
	 }
	 
	 for(int j=1;j<n;j++)
	 {
	     arr[0][j]+=arr[0][j-1];
	 }
	 
	 for(int i=1;i<n;i++)
	 {
	     for(int j=1;j<n;j++)
	     { 
	         
	        arr[i][j]+=arr[i-1][j]+arr[i][j-1]-arr[i-1][j-1];
	     }
	 } 
}


