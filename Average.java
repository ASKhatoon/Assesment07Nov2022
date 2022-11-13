//23.
//Print the average of three numbers entered by user by creating a class named 'Average' 
//having a method to calculate and print the average.


package str;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number :");
        int a = s.nextInt();
        
        System.out.println("Enter second number :");
        int b = s.nextInt();
        
        System.out.println("Enter third number :");
        int c = s.nextInt();
        
       int average = (a+b+c)/3;
       System.out.println("Average of the given numbers : "+average);
        
        
	}

}
