package output.com.treselle;
class Father 
{
  void show()
  {
  System.out.println("I am having the habit of singing");
 }
}
 class Child extends Father
 {
  void show()
  {
  System.out.println("I am having the habit of Dancing");
  }
 }
 class Override
{ 
     public static void main(String[] args)
	 {
   // FatherClass reference and object
  Father f1 = new Father();
   // FatherClass reference but Child class object
  Father f2 = new Child();   
    //Calls the method from Father class
   f1.show();
     //Calls the method from Child Class class
   f2.show();
  }
  }

  