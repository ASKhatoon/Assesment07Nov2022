import java.util.Scanner;

public class ArmstrongNumber {

public static void main(String []arsg) {
 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
int temp = num;
int p = 0;

System.out.println(" number : "+num);
/* function to calculate sum of individual digits */

while(num > 0) {
 
int reminder = num % 10;
p = (p) + (reminder*reminder*reminder);
num = num / 10 ;
}

/* to check value of P is equals to user input */

if (temp==p){

System.out.println( "it is an Armstrong number");
}
else {
System.out.println("it is not an Armstrong number");
}

}
}
