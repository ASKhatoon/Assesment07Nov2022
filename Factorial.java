import java.util.Scanner;

public class Factorial {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int i = 0;
		if(i<=num)
		{
			int fib = num * (num - 1);
			System.out.println("The factorial of "+num+" is "+fib);
		}
	}

}
