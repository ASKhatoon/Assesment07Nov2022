package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceBetweenConsecutiveNumbers {

	public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }

	      System.out.println(Arrays.toString(myArray));
	      
	      System.out.println("The difference between the two consecutive numbers");
			for (int counter = 0; counter < myArray.length; ++counter) {
			    int diff = counter == 0 ? 0 : myArray[counter] - myArray[counter - 1];
			    System.out.println("\t" + myArray[counter] + "\t\t\t" + diff);    
	   }
	
	}
}
		

	
