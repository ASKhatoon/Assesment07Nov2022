//16
//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
//First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
//Length and breadth of rectangle are entered through keyboard.


package str;

public class RectArea {
	
	int length;
	int breadth;
	
	RectArea(int l, int b) {
		length = l;
		breadth = b;
	}
	public int setDim() {
		int result = length * breadth;
		return result;
	}
	public void getArea() {
		System.out.println("Area of Rectangle = "+ setDim());
	}
	public static void main(String args[]) {
		RectArea x = new RectArea(5,5);
		System.out.println(x.length);
		System.out.println(x.breadth);
		x.getArea();
	}
}
		

	
	 
    	  
      
