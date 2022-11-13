package str;

import java.util.Scanner;

class Distance {

	double feet, inches;

	private void getdistance() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter feet> ");
		feet = in.nextDouble();
		System.out.print("Enter inches> ");
		inches = in.nextDouble();
	}

	private void addDistance(Distance d1, Distance d2)
	{
		double sumofFeet = d1.feet + d2.feet;
		double sumofInch = d1.inches + d2.inches;
		System.out.println(sumofFeet + " " + sumofInch);
	}

	public static void main(String[] args)
	{
		Distance d1 = new Distance();
		Distance d2 = new Distance();
		System.out.println("Enter first distance ");
		d1.getdistance();
		System.out.println("Enter second distance ");
		d2.getdistance();
		System.out.println("Result after adding two distances");
		d1.addDistance(d1, d2);

	}
}