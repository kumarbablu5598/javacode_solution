

Take Integer N as input and print the following pattern.
    
I/p  N=4

O/P

ABCDCBA
ABC CBA
AB   BA
A     A

I/P N=7
    
O/p   

         
ABCDEFGFEDCBA
ABCDEF FEDCBA
ABCDE   EDCBA
ABCD     DCBA
ABC       CBA
AB         BA
A           A

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
               
             char ch ='A';
            
            for(int j=0;j<2*n-1;j++)
            {    
                if(j>=n-i && j<=n-2+i)
                  System.out.print(" ");  
                else 
                {    if(i==0)
                      {
                          
                           if(j<n)
                             System.out.print(ch++);
                            else if(j==n)
                            {
                                ch-=2;
                                System.out.print(ch);
                            }
                            else{
                               System.out.print(--ch); 
                            }
                      }
                      else
                      {
                           if(j<n)
                             System.out.print(ch++);
                     
                           else 
                              System.out.print(--ch);
                      }
                }
            }
            System.out.println();
             
        }
    }
}
