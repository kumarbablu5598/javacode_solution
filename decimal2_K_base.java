/* convert Decimal number to K base number*/ 
import java.io.*;
import java.util.*;
class GFG 
{ 
    public static int  decimal_TO_K_base(int N,int K)
    {
        
       int  ans=0;
       int mul=1;
      while(N!=0)
       {
             int dig=N%K;
             ans+=(mul*dig);
             mul=mul*10;
             N=N/K;
         }
        return ans; 
    }
  
    public static void main(String[] args) 
    {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       
        System.out.println(decimal_TO_K_base(n,k));
    
    } 
} 
