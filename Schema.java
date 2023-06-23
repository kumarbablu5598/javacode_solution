//@babluyadav5598
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        Map<String,Student> map = new HashMap<String,Student>();
        for(int i=0;i<n;i++)
        {
            //System.out.println("Enter Table Name");
            String  Table_Name = sc.next();
            Student stu = new Student(sc.next(),sc.nextInt(),sc.next(),sc.next());
            map.put(Table_Name,stu);
        }
       

        for( Map.Entry<String,Student> student :map.entrySet()){
            System.out.println("Table : "+ student.getKey());
            Student stu = student.getValue();
            System.out.println("{ Name - "+stu.getName()+","+" Age - "+stu.getAge()+","+ " Email Id - "+stu.getEmail_Id()+","+" Phone no- "+stu.getPhone_No()+" } ");
           
        }
     

    }

}
class Student{
    String Name;
    int Age;
    String Email_Id;
    String Phone_No;

    public Student(String name, int age, String email_Id, String phone_No) {
        Name = name;
        Age = age;
        Email_Id = email_Id;
        Phone_No = phone_No;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail_Id() {
        return Email_Id;
    }

    public void setEmail_Id(String email_Id) {
        Email_Id = email_Id;
    }

    public String getPhone_No() {
        return Phone_No;
    }

    public void setPhone_No(String phone_No) {
        Phone_No = phone_No;
    }
}
