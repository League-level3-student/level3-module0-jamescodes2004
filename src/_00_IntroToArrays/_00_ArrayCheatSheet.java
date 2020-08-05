package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] strings = new String[] {"John", "Will", "James", "Jordan", "Jacob"};
		//2. print the third element in the array
System.out.println(strings[2]);
		//3. set the third element to a different value
strings[2]="Randy";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < strings.length; i++) {
			strings[i]="Cheryl";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		//7. make an array of 50 integers
int[] integers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
for (int i = 0; i < integers.length; i++) {
	Random rand = new Random();
	integers[i]=rand.nextInt(100);
	System.out.println(integers[i]);
}
//9. without printing the entire array, print only the smallest number on the array
int smallest=100;
int largest=0;
int last=0;
for (int i = 0; i < integers.length; i++) {
	if (integers[i]<smallest) {
		smallest=integers[i];
	}
	if (integers[i]>largest) {
		largest=integers[i];
	}
	if(i==49) {
		last=integers[i];
	}
	
}
System.out.println(smallest);
System.out.println(largest);
System.out.println(last);
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
