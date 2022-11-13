import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int i = 0, first = 0, second = 1, next = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
    
	while( i < num) {
		 if(i<=1) {
		next = i;	
	} else {
		next = first + second;
		first = second;
		second = next;
	}
		 System.out.println(next);
		 i++;
	
     }
	sc.close();
	}

}
