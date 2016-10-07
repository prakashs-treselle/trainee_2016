package opt.com.treselle;
import java.util.Scanner;
class Fibonacci
{
public static void main(String args[])
{
int i,f1=0,f2=1,f3,temp,n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the no., of series to be generated\t");
n=s.nextInt();
System.out.print("\n" +f1+"\t"+f2);
for(i=2;i<=5;i++)
{
f3=f2+f1;
f1=f2;
f2=f3;
System.out.print("\t"+f3);
}
}
}


