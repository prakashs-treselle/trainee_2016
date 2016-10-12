/*
*code to represent an Array Index Outof Boud Exception
*/

package opt.com.treselle.exception;
class Marks
{
	public static void main(String args[])
	{
		int marks[]={10,20,30};
		System.out.println("the mark 1 is" +marks[0]);
		System.out.println("the mark 2 is" +marks[1]);
		System.out.println("the mark 3 is" +marks[2]);
		//marks[3] not found therfore exception occurs
		System.out.println("the mark 4 is" +marks[3]);
	}
}