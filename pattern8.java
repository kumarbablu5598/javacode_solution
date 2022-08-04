

Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P

    1    
   121   
  12321  
 1234321 
123454321

I/P N=8
    
O/p   

         
       1       
      121      
     12321     
    1234321    
   123454321   
  12345654321  
 1234567654321 
123456787654321

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
            int k=1,p=i;
            
            for(int j=0;j<2*n-1;j++)
            {  
                if(j>=n-i-1 && j<=n-1+i)
                {
                    if(j<n)
                    System.out.print(k++ );
                     else 
                     System.out.print(p--);
                 
                }
               
                else 
                System.out.print(" ");
            }
            System.out.println();
             
        }
    }
}
