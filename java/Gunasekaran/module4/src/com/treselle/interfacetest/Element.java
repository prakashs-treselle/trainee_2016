package opt.com.treselle.interfacetest;
import opt.com.treselle.interfacetest.Iqueue;
import opt.com.treselle.interfacetest.QueueImp;
import java.util.Scanner;
class Element
{
public static void main(String args[])
{
	QueueImp queue=new QueueImp();
	Scanner sc=new Scanner(System.in);
	System.out.println("QUEUE INTERFACE");
	int ch;
	do
	{
	System.out.println("1.addelement\t 2. remove element\t 3.display");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		
		queue.insert();
		break;
	case 2:
		queue.delete();
		break;
	case 3:
		queue.display();
		break;
	default:
		System.out.println("enter the correct choice");
		}
		System.out.println("do you want to add/ delete element in queue\t 1. yes \t 2. no");
		ch=sc.nextInt();
		}while(ch==1);
}
}