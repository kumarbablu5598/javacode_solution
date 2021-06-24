
/*A  matrix size N x N. You have to find the maximum sum of element in any sub-matrix of size K x K.
Note:  negative element  also possible  

Example 1:
 
Input: N = 5, K = 3 
mat[[]] = {1, 1, 1, 1, 1} 
          {2, 2, 2, 2, 2} 
          {3, 8, 6, 7, 3} 
          {4, 4, 4, 4, 4} 
          {5, 5, 5, 5, 5}
Output: 48

Explanation: {8, 6, 7}
             {4, 4, 4}
             {5, 5, 5}     has the maximum sum


Example 2:

Input: N = 1, K = 1
mat[[]] = {{4}} 
Output: 4
                    

  */

solution :-

public int Maximum_Sum(int arr[][],int n,int k)
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
	 
	 int ma=Integer.MIN_VALUE;
	 for(int i=0;i<n;i++)
	 {
	     for(int j=0;j<n;j++)
	     { 
	         if(arr[i][j]>ma)
	         ma=arr[i][j];
	     }
	 }
	 if(k==1)  
	 return ma;
	 if(k==n)
	 return arr[n-1][n-1];
	 int M=Integer.MIN_VALUE;
	 int sum=0;
	 
	 for(int i=k-1;i<n;i++)
	 {
	     for(int j=k-1;j<n;j++)
	     {   
	         sum=arr[i][j];
	         if(i-k>=0)
	         {
	             sum-=arr[i-k][j];
	         }
	          if(j-k>=0)
	         {
	             sum-=arr[i][j-k];
	         }
	         if(j-k>=0 && i-k>=0)
	         {
	             sum+=arr[i-k][j-k];
	         }
	     
	         if(sum>M)
	         M=sum;
	     }
	 }
	 return M;
}
	 
	 
