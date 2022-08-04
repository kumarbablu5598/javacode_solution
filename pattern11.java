

Take Integer N as input and print the following pattern.
    
I/p  N=3

O/P

*  
** 
***
** 
*  
   
I/P N=5
    
O/p   

*    
**   
***  
**** 
*****
**** 
***  
**   
* 

// java code

 
import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<n;j++)
            {  
                
               
              if(i<n)
              {        
                if(j<=i)
                     System.out.print("*");
                 else 
                     System.out.print(" ");
              }  
             else 
             {
                 int p=2*n-2-i;
                 if(j<=p)
                     System.out.print("*");
                 else 
                     System.out.print(" ");
             }   
                    
            }
            System.out.println();
             
        }
    }
}
