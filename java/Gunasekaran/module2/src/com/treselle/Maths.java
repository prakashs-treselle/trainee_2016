import package mathematical.com.treselle.Operation

class Maths
{
	public static void main(String args[])
	{
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
				add(a,b);
				break;
		case 2:
				System.out.println("enter the no. you want to subtract");
				int a=sc.nextInt();
				int b=sc.nextInt();
				sub(a,b);
				break;
		case 3:
				System.out.println("enter the no. you want to multiply");
				int a=sc.nextInt();
				int b=sc.nextInt();
				product(a,b);
				break;
		case 4:
				System.out.println("enter the no. you want to divide");
				int a=sc.nextInt();
				int b=sc.nextInt();
				divide(a,b);
				break;
		case 5:
				System.out.println("enter the no. you want find the factorial");
				int n=sc.nextInt();
				fact(n);
				break;
		case 6:
				System.out.println("Enter the digit you want to reverse");
				int r=sc.nextInt();
				reverseDigit(r);
				break;
		default:
				System.out.println("enter the choice between (1-6)");
		}		
	
	}
}