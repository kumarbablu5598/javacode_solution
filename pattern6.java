

Take Integer N as input and print the following pattern.
    
I/p  N=4

O/P

   * 
  * * 
 * * * 
* * * * 

I/P N=7
    
O/p   

         
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * *

// java code

 
import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<n;j++)
            {  
                if(j>=n-1-i)
                System.out.print("* ");
                else 
                System.out.print(" ");
            }
            System.out.println();
             
        }
    }
}
