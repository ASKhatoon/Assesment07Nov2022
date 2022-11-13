//20
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 
//and 5 units by creating a class named 'Triangle' with constructor having
//the three sides as its parameters.



package str;

public class Triangle2 {
	double length,breadth,height;
	
	Triangle2(double l, double b, double h) {
		length = l;
		breadth = b;
		height = h;
		
	}
	public double setData1() {
	double	A = (0.5)*(length*breadth);
		return  A;
		}
	public double setData2() {
		
	double	P = (0.33)*(length*breadth*height);
		return P;
	}
	public void getData() {
		System.out.println("Area of Triangle = "+setData1());
		System.out.println("Preimeter of Triangle = "+setData2());
	}
	
}
    class Tri2Test {
    	public static void main(String []args) {
    		
    		Triangle2 t1 = new Triangle2(3.0,4.0,5.0);
    		t1.getData();
    		}
}
