
package opt.com.treselle;
import java.util .Scanner;
class Tables
{
public static void main(String [] args)
{
int a;
Scanner s=new Scanner(System.in);

for(a=1;a<=10;a++)
{
for(int i=1;i<=10;i++)
{
System.out.println(a + "*" +i+ "=" + (a*i));
}
System.out.println("\n");
}
}
} 