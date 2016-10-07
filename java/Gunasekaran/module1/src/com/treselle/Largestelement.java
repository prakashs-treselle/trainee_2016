package opt.com.treselle;
class Largestelement
{
public static void main(String [] args)
{
int a[]=new int[] {25,58,55,86,36};
int smallest=a[0],largest=a[0];
int len=a.length;
for(int i=1;i<len;i++)
{
if(a[i]<smallest)
{
smallest=a[i];
}
else if(a[i]>largest)
{
largest=a[i];
}
}
System.out.println("the largest number is " +largest);
System.out.println("the smallest number is " +smallest);
}
}
 

