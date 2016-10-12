package output.com.treselle;
import java.util.Scanner;

abstract class Door1
{
	abstract public void openDoor();
	abstract public void closeDoor();
public static void horn()
{
	System.out.println("tring");
}
public static int turn()
{


	System.out.println("You want to turn Left or Right\t1.Left\t2.Right");
   int side;
     Scanner sc=new Scanner(System.in);
   side=sc.nextInt();
   switch(side)
   {
   case 1:
    System.out.println("Vehicle is turning this side <----<----<----<----<----");
	break;
	case 2:
    System.out.println("Vehicle is turning this side ---->---->---->---->---->");
	break;
	}
	return 0;
}
}