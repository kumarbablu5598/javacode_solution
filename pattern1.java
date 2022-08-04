
Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P

* 
* * 
* * * 
* * * * 
* * * * *

I/P N=6
    
O/p   

* 
* * 
* * * 
* * * * 
* * * * *   
* * * * * *   

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
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
             
        }
    }
}

