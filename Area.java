//22
//Write a program to print the area of a rectangle by creating a class named 'Area'
//taking the values of its length and breadth as parameters of its constructor and having
//a method named 'returnArea' which returns the area of the rectangle. Length and breadth
//of rectangle are entered through keyboard.


package str;
import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter length of the Rectangle : ");
		int l = s.nextInt();
		
		System.out.println("Enter breadth of the Rectangle : ");
		int b = s.nextInt();
		
		int area = l*b;
		System.out.println("Area of Rectangle : "+area);
	}

}
