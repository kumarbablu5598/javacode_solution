N=5
  
5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5 
N=5
  
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 


N=3
3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3


  // java code 

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<2*n-1;i++)
       {
           for(int j=0;j<2*n-1;j++)
           {
               int left =j;
               int top=i;
               int right = 2*(n-1)-j;
               int bottom = 2*(n-1)-i;
               
               int MIN = Math.min(Math.min(left,right),Math.min(top,bottom));
               System.out.print(n-MIN+ " ");
           }
            System.out.println();
       }
    }
}
