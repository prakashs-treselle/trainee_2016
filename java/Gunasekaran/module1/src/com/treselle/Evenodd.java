package opt.com.treselle;
import java.util.Scanner;
class Evenodd
{
public static void main(String args[])
{
int i,start,end;
Scanner s=new Scanner(System.in);
System.out.println("enter the start digit");
start=s.nextInt();
System.out.println("enter the end digit");
end=s.nextInt();
System.out.println("printing the odd numbers");
for(i=start;i<=end;i++)
{
	if(i%2 !=0)
	{
	System.out.println(i);
	}
}
System.out.println("printing the even numbers");
for(i=start;i<end;i++)
{
	if(i%2 ==0)
	{
	System.out.println(i);
	}
}

}
}









	