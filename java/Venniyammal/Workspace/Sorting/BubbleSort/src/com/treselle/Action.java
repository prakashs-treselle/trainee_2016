package opt.com.treselle;
import java.util.Scanner;
 class Action
 { 
        public void bubbleSort() 
		{		
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the number of element to sort :");
                int n = in.nextInt();
                int temp = 0;
               //create an int array we want to sort using bubble sort algorithm
                int intArray[] = new int[n];
                for(int i =0 ; i<n ; i++)
				{
					intArray[i]=in.nextInt();
				}
                //print array before sorting using bubble sort algorithm
                System.out.println("\t***Array Before Bubble Sort***\n\t\t");
                for(int i=0; i < intArray.length; i++)
				{
                        System.out.print( "\n\t\t "+intArray[i] );
                }
              
                
                for(int i=0; i < n; i++)
				{
                        for(int j=1; j < (n-i); j++)
						{
                               
                                if(intArray[j-1] > intArray[j])
								{
                                        //swap the elements!
                                        temp = intArray[j-1];
                                        intArray[j-1] = intArray[j];
                                        intArray[j] = temp;
                                }
                               
                        }
                }
				//print array after sorting using bubble sort algorithm
                System.out.println("\n\t***Array After Bubble Sort***\n\t\t");
                for(int i=0; i < intArray.length; i++)
				{
                        System.out.print( "\n\t \t"+intArray[i] );
				}
       
        }
}