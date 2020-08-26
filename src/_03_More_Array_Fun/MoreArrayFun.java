package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

import _02_Firework_Display.Spark;

public class MoreArrayFun {
	 static //1. Create a main method to test the other methods you write.
	String[] strings;
	public static void main(String[] args) {
		strings= new String[5];
		for (int i = 0; i < strings.length; i++) {
			strings[i]= new String("string "+i);
		}
		StringMethod(strings);
		ReverseMethod(strings);
		StringOther(strings);
		StringRandom(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void StringMethod(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void ReverseMethod(String[] strings) {
		
		for (int i = strings.length-1; i >= 0; i--) {
		
			System.out.println(strings[i]);
		}
		
		
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void StringOther(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if(i%2==0) {
				System.out.println(strings[i]);
			}
		}
		
		
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void StringRandom(String[] strings) {
		Random rand = new Random();
		ArrayList<Integer> cant = new ArrayList<Integer>();
	
		int num=0;
		for (int i = 0; i < strings.length; i++) {
			int good = rand.nextInt(5);
			for (int j = 0; j < cant.size()-1; j++) {
				
			
			if(cant.get(j)==good) {
				good = rand.nextInt(5);
				j=0;
				cant.add(good);
				num++;
				
			}
			else {
				
				
			}
			}
			System.out.println(strings[good]);
			
		}
		
		
	}
	
}
