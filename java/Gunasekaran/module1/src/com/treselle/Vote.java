package opt.com.treselle;
import java.util.Scanner;
class Vote
{
public static void main(String []args)
{
int age;
Scanner n=new Scanner(System.in);
age=n.nextInt();
if(age>0)
System.out.println("positive");
elseif(age<0)
System.out.println("negative");
if(age=0)
System.out.println("equal to zero");
else
System.out.println("NOT ELIGIBE TO VOTE");
}
}