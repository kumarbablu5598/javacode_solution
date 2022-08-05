

Take Integer N as input and print the following pattern.
    
I/p  N=3

O/P


     1 
    1 1 
   1 2 1 
   
I/P N=5
    
O/p   

     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 

// java code

 
import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for (int i =1 ; i <=n; i++) 
        {
            for (int j = 0 ; j <= n - i; j++) 
             {  
                 //for spaces
                 System.out.print(" ");
             }
 
             
            int C = 1;
            for (int j =1; j <= i ; j++) 
            {
 
                 
                System.out.print(C+" ");
                C = C * (i  - j) / j;
            }
            System.out.println();
        
             
        }
    }
}
