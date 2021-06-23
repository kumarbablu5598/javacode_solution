/* convert Decimal number to binary */ 
import java.io.*;
import java.util.*;
class GFG 
{ 
    public static int  decimal2binary(int N)
    {
        
       int  ans=0;
       int mul=1;
      while(N!=0)
       {
             int dig=N%2;
             ans+=(mul*dig);
             mul=mul*10;
             N=N/2;
         }
        return ans; 
    }
  
    public static void main(String[] args) 
    {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       
        System.out.println(decimal2binary(n));
    
    } 
} 
