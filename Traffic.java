package JavaAssignments;

import java.util.Scanner;

public class Traffic {
	public static void main(String []args)  {
		String s1 = "red";
		String s2 = "yellow";
		String s3 = "geen";
		
		System.out.println("Traffic light");
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a colour ");
	System.out.println(s1+"  "+s2+"  "+s3);
	String val1 = sc.next();
	
	
	if(val1.contentEquals(s1)) {
		System.out.println("you are selected red colour");
		System.out.println("STOP");
	} else if(val1.contentEquals(s2)) {
		
		System.out.println("you are selected yellow color");
		System.out.println("READY");
		
	} else if(val1.contentEquals(s3)) {
		
		System.out.println("you are selected green colour");
		System.out.println("GO");
	}
	else {
		System.out.println("Invalid colour");
	}
	}
}