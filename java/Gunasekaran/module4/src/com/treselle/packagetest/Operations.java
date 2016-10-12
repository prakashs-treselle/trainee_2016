package opt.com.treselle.packagetest;

public class Operations
{
	public void add(int num1,int num2)
	{
		int a=num1;
		int b=num2;
		int c=a+b;
		System.out.println("the sum is " +c);
	}
	public void sub(int num1,int num2)
	{
		int a=num1;
		int b=num2;
		int c=a-b;
		System.out.println("the difference is " +c);

	}
	public void product(int num1,int num2)
	{
		int a=num1;
		int b=num2;
		int c=a*b;
		System.out.println("the product of two number  is " +c);

	}
	public void divide(int num1,int num2)
	{
		int a=num1;
		int b=num2;
		int c=a/b;
		System.out.println("the quotient " +c);

	}
	public void fact(int num)
	{
		int n=num;
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
			
		}
		System.out.println("the factorial of number is" +f);
	
	}
	public void reverseDigit(int r)
	{
		int digit=r;
		int reverse=0;
		 
			while(r!=0)
				{
						reverse=reverse*10;
						reverse=reverse+ r%10;
						r=r/10;
				}
				System.out.println("the reverse digit is" +reverse);
		
		}
	}
