
/* convert binary number to decimal */ 
import java.io.*;
import java.util.*;
import java.lang.*;
class GFG 
{ 
    public static int  binary2decimal(int N)
    { 
        int i=0,sum=0;
       while(N!=0)
       { 
           int r=N%10;
           sum+=r*(Math.pow(2,i));
           N/=10;
           i+=1;
       }
       return sum;
    }
  
    public static void main(String[] args) 
    {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       
        System.out.println(binary2decimal(n));
    
    } 
} 
