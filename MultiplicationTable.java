
import java.util.Scanner;

public class MultiplicationTable {
	
   public static void main(String args[]) {
	   
      System.out.println("Enter the first integer variable :: ");
      Scanner sc1 = new Scanner(System.in);
      int num1 = sc1.nextInt();
      
      System.out.println("Enter the second integer variable :: ");
      Scanner sc2 = new Scanner(System.in);
      int num2 = sc2.nextInt();
      
      while(num1 < num2) {
      for(int i=1; i<= 10; i++) {
         System.out.println(""+num1+" X "+i+" = "+(num1*i));
      }
      System.out.println("         ");
         num1++;
      
   }
}
}