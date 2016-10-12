package opt.com.treselle.packagetest;
import opt.com.treselle.packagetest.Operations;

import java.util.Scanner;
public class Maths 
{
	public static void main(String args[])
	{
	Operations op=new Operations();
	Scanner sc=new Scanner(System.in);
	System.out.println("MATHEMATICAL OPERATIONS");
	System.out.println("1. addition/t 2. Subtraction/t 3. multiplication/t 4. division /t 5.factorial /t 6. reverse digit");
	int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				System.out.println("enter the no. you want to add");
				int a=sc.nextInt();
				int b=sc.nextInt();
				op.add(a,b);
				break;
		case 2:
				System.out.println("enter the no. you want to subtract");
				int c=sc.nextInt();
				int d=sc.nextInt();
				op.sub(c,d);
				break;
		case 3:
				System.out.println("enter the no. you want to multiply");
				int w=sc.nextInt();
				int x=sc.nextInt();
				op.product(w,x);
				break;
		case 4:
				System.out.println("enter the no. you want to divide");
				int y=sc.nextInt();
				int z=sc.nextInt();
				op.divide(y,z);
				break;
		case 5:
				System.out.println("enter the no. you want find the factorial");
				int n=sc.nextInt();
				op.fact(n);
				break;
		case 6:
				System.out.println("Enter the digit you want to reverse");
				int r=sc.nextInt();
				op.reverseDigit(r);
				break;
		default:
				System.out.println("enter the choice between (1-6)");
		}		
	
	}
}