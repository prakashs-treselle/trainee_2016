package opt.com.treselle;
import java.util.Scanner;

class Implementation

   {
    
      
  public void setValues(  int regno, String name1 ,Double salary1)

   {
     
       System.out.println("Register number is  : " + regno);
       System.out.println("Name of the candidate  is  : " + name1);
       System.out.println("Salary is  :  " + salary1);
   }

}


class Encapsulation
{
  public static void main(String []args)	
   { 
     int regNo;
     String name;
     Double salary;
           
      Scanner in = new Scanner(System.in);
      System.out.println("Enter Register No:");
      regNo = in.nextInt();
      System.out.println("Enter the Name:");
      name = in.next();
      System.out.println("Enter the salary :");
      salary = in.nextDouble();
     

   Implementation i= new Implementation();
    i.setValues(regNo,name,salary);

  }
}