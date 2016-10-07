package opt.com.treselle;
/*import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int i,n,fact=1;
Scanner s=new Scanner(System.in);
System.out.println("enter the factorial value");
n=s.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("the factorial is " +fact);
}
}*/





import java.util. Scanner;
class fact
{
static factorial(int n)
{
if(n==0)
 
return 1;
 
else
 
return (n*fact(n-1));
 
}
}
class Factorial
{
public static void main(String args[])
{
int number;
Scanner s=new Scanner(System.in);
number=s.nextInt();
fact=factorial(number);
System.out.println("the factorial value is " +fact);
}
}


