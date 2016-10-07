package opt.com.treselle;
import java.util.Scanner;
class Digitadd
{
public static void main(String [] args)
{
int input,lastdigit,sum=0;

Scanner s=new Scanner(System.in);
System.out.println("Enter the digit");
input=s.nextInt();

while(input!=0)
{
lastdigit=input%10;
sum=sum+lastdigit;
input=input/10;
}
System.out.println("the sum of digit is " +sum);

}
}



