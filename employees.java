/*
you are given N employee object that have name,salary,and id.
your task is to sort these employees by their salary in decending order.if salary of two employee are 
same then sort using id in decending order.


*/


//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;
class GFG {
	public static void main (String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int t= sc.nextInt();
	 
	 while(t-->0)
	 {
	     int n=sc.nextInt();
	     Employee arr[]=new Employee[n]; //array of employees
	     
	     for(int i=0;i<n;i++)
	     {
	         String name;
	         int salary;
	         int id;
	         name=sc.next();
	         salary=sc.nextInt();
	         id=sc.nextInt();
	         Employee e=new Employee(name,salary,id); //object with the attributes
	         arr[i]=e; //put in array
	         
	     }
	     
	     Geeks obj=new Geeks();
	     obj.empSort(arr,n); //sorter function
	 };
	
	    
	}
}

class Employee //Employee class
{
    //attributes of an employee
    String name;
    int salary;
    int id;
    public Employee(String name, int salary,int id) //setter using constructor
    {
        this.name=name;
        this.salary=salary;
        this.id=id;
        
    }
}



 // } Driver Code Ends
//User function Template for Java

class MySort implements Comparator<Employee> 
{
  public int compare(Employee a, Employee b) 
  { 
    Integer a11=a.salary;
    Integer b11=b.salary;
    if(a11.equals(b11))
    {
        Integer a1=a.id;
        Integer b1=b.id;
        return b1.compareTo(a1);
    }
    else
    {
      Integer a1=a.salary;
       Integer b1=b.salary;  
        return b1.compareTo(a1);
    }

  }
}
class Geeks 
{
    static void empSort(Employee e[],int n)
    {
        
        
    TreeSet<Employee> ts=new TreeSet<Employee>(new MySort());
    for(Employee em: e)
    {
        ts.add(em);
    }
    
        for(Employee tdd: ts)
        {
            System.out.println(tdd.name+" "+tdd.salary+" "+tdd.id);
        
        }
        
    }
}

// { Driver Code Starts.
  // } Driver Code Ends
