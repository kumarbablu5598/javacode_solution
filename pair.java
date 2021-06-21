/*Given an array A of N pairs of integers.
The task is to sort the array on the basis of first element.

Input:
3
1 2 5 4 3 6

Output:
1 2 3 6 5 4

Explanation:
Pairs are (1, 2), (5, 4), (3, 6). Sorting them on 
basis of first element, we have (1, 2), (3, 6), (5, 4).  */



//Initial Template for Java

import java.io.*;
import java.util.*;

// Pair class
class Pair
{
    int x;
    int y;
    
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
// Method -->1
class custom_Compare
{
    
     
    
    public static void sortPairs(Pair arr[], int N)
    {
        
       Arrays.sort(arr, new Comparator<Pair>()
       {
            @Override public int compare(Pair p1, Pair p2)
            {
                return p1.x - p2.x;
            }
        });
        
        
        
        for(int i = 0;i<N;i++)
         {
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}
// Method -->2
class comp implements Comparator<Pair>
{
    public int compare(Pair p1, Pair p2)
    {
         return p1.x - p2.x;
    }
}
class custom_Compare
{
    
    public static void sortPairs(Pair arr[], int N)
    {
        
       Arrays.sort(arr, new comp());
       
     
        for(int i = 0;i<N;i++)
         {
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}
 
// Driver class with main function
class GFG 
{
    
    // Driver code
	public static void main (String[] args) 
        {
		
		//taking input using Scanner class 
		Scanner sc = new Scanner(System.in);
		
		//taking count of testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0)
                {
		    
		    //taking count of elements
		    int N = sc.nextInt();
		    
		    // Creating an array of Pair
		    Pair arr[] = new Pair[N];
		    
		    //adding elements to Pair array
		    for(int i = 0;i<N;i++)
                     {
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        arr[i] = new Pair(x, y);
		     }
		    
		    //creating an object of custom_Compare class
		    custom_Compare obj = new custom_Compare();
		    
		    //calling sortPairs() method of
		    //class  custom_Compare
		    obj.sortPairs(arr, N);
		}
	}
}  



