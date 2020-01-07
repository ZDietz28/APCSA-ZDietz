package Chatper7dot2;

//Below each comment, add the code indicated.  I already have code to display a description of each item in the output.

public class ForLoopArrayPractice
{
	public static void main(String[] args)
	{
		// Declare and initialize array variable "intArray" to hold the values: 5,3,12,9,7
		int[] intArray = new int[] {5,3,12,9,7};
		String[] strArray = new String[] {"keys", "camera", "vacation", "magic", "minivan"};
		// Display intArray using a for-each loop
		System.out.println("\n*******************************************************");
		System.out.println("intArray displayed using for each loop loop\n");
		for(int x : intArray) {
			System.out.print(x + ",");
		}


		// Sum of the elements of intArray is calculated and displayed using a for-each loop
		System.out.println("\n*******************************************************");
		System.out.println("Sum of the elements of intArray\n");
		int sum = 0;
		for(int x:intArray) {
			sum += x;
		}
		System.out.println(sum);


		// Count the number of elements in intArray that are between 5 and 10, inclusive.  Display the result: ___ elements are between 5 and 10
		System.out.println("\n***********************************************************");
		System.out.println("Counting number of items between 5 and 10.\n");
		sum = 0;
		for(int x : intArray) {
			if(x > 4 && x < 11) {
				sum ++;
			}
		}
		System.out.println(sum + "elements are between 5 and 10");


		// Search intArrayList for the number 7 using a for-each loop. Display "7 was found" or "7 was not found"
		System.out.println("\n***********************************************************");
		System.out.println("Search intArray for the number 7 using a for-each loop.\n");
		boolean flag = false;
		for(int x : intArray) {
			if(x == 7)
				flag = true;
			else
				flag = false;
		}
		if(flag)
			System.out.println("7 was found");
		else
			System.out.println("7 was not found");


		// Declare and initialize array variable "words" to hold the values: "keys", "camera", "vacation", "magic", "minivan"



		// Display words using a for-each loop
		System.out.println("\n*******************************************************");
		System.out.println("words displayed using for each loop loop\n");
		
		for(String s : strArray) {
			System.out.print(s + " ");
		}


		// Length of each element of words is displayed
		System.out.println("\n*******************************************************");
		System.out.println("Length of each element of words is: \n");
		for(String s : strArray) {
			System.out.println(s + " = " + s.length() + " letters long");
		}


		/* Count and display each element in words that start with "m".  Display the result.
		   For example, the output might be:
		   magic
		   minivan
		   2 words start with m
		*/
		System.out.println("\n***********************************************************");
		System.out.println("Words that start with m.\n");
		sum = 0;
		for(String s : strArray) {
			if(s.charAt(0) == 'm') {
				System.out.println(s);
				sum ++;
			}
		}
		System.out.println(sum + " words start with m");
		

	}
}
