import java.util.Arrays;
import java.util.Scanner;

	import java.util.Scanner;

	public class CountTheInput {
		
			public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("How many elements the array will have: ");
			int n = in.nextInt();
			int odd = 0,even = 0;
			int [] arr = new int[n];

			for(int i = 0; i < arr.length; i++) {
			System.out.println("Value of index " + i);
			arr[i] = in.nextInt();
			}
			System.out.println();
			System.out.println("Original Array: " + Arrays.toString(arr));
			for(int j = 0; j < arr.length; j++) {
			if(arr[j] % 2 == 0) {
			even++;
			}else {
			odd++;
			}
			}
			System.out.println("Number of even elements in the array: " + even);
			System.out.println("Number of odd elements in the array: " + odd);
			}
			}

			