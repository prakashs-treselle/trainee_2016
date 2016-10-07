package output.com.treselle;
class Sum
{
void add(int a, int b)
{
            System.out.println("Sum of two="+(a+b));
}

void add(int a, int b,int c)  //same method name with different argument
{
            System.out.println("Sum of three="+(a+b+c));
}
}
class Polymorphism
{
      public static void main(String args[])
      {
            Sum s=new Sum();
            
            s.add(10,15);
         s.add(10,20,30); 
   }
 }                                       