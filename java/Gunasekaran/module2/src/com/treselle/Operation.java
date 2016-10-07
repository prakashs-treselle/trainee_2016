package mathematical.com.treselle;

class Operations
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
		int f=num;
		for(int i=1;i<=f;i++)
		{
			f=f*i;
			System.out.println("the factorial of number is" +f);
		}
	
	}
	public void reverseDigit(int r)
	{
		int digit=r;
		int reverse=0;
			while(n!=0)
				{
						reverse=reverse*10;
						reverse=reverse+ n%10;
				}
				System.out.println("the reverse digit is" +reverse);
		
	}
}
