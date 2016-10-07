package opt.com.treselle;
class MethodOverLoading
{

// Method overloading 

  public void display(int a, int b)
   {
    int c = a+b;
    System.out.println("Result from Integer Addition:" +c );
    }
   

  public void display(String name , String lname)
    {
      System.out.println("Result from String Addition:" + ("\n"+ name+ "\t" + lname));
      
     }


  public void display( int n, String name)
     {
       System.out.println( "Result from String and Int Addition: \t" + name + "\t" + n);
     }
  
// Method Overriding 
  public void displayDetail( int n, String name)
      {
        System.out.println("Overrided Method from Super Class: \t" + n + "\t" + name );
      }
   }


class SubClass extends MethodOverLoading
    {
      
         
         public void displayDetail( int num, String name1)
           {
     	 System.out.println("Overrided Method from SubClass: \t" + num + "\t" + name1 );
           }
       }
class Addition
     {
       public static void main(String [] args) 
       {

// Calling Overloaded Methods

         MethodOverLoading m = new MethodOverLoading();
         m.display(2, 3);
         m.display("Treselle" , "Systems");
         m.display(7, " Treselle");
 // calling Overrided method  
     
        m.displayDetail(101 , "Treselle Software");
     
         MethodOverLoading mo = new  SubClass();    // Dynamic Overriding 
   
         mo. displayDetail(102, "Treselle Systems" );
      }
}
  
    
 
 