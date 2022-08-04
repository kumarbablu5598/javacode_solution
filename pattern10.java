

Take Integer N as input and print the following pattern.
    
I/p  N=4

O/P

   *   
  ***  
 ***** 
*******
 ***** 
  ***  
   *   
   
I/P N=7
    
O/p   

      *      
     ***     
    *****    
   *******   
  *********  
 *********** 
*************
 *********** 
  *********  
   *******   
    *****    
     ***     
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
            for(int j=0;j<2*n-1;j++)
            {  
                
               
              if(i<n)
              {        
                if(j>=n-1-i && j<=n-1+i)
                     System.out.print("*");
                 else 
                     System.out.print(" ");
              }  
             else 
             {
                 int p=2*n-2-i;
                 if(j>=n-1-p && j<=n-1+p)
                     System.out.print("*");
                 else 
                     System.out.print(" ");
             }   
                    
            }
            System.out.println();
             
        }
    }
}
