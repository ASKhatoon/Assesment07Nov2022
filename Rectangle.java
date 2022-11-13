//21
//Write a program to print the area of two rectangles having sides (4,5) and (5,8)
//respectively by creating a class named 'Rectangle' with a method named 'Area' 
//which returns the area and length and breadth passed as parameters to its constructor.



package str;

public class Rectangle {
	
	int length;
	int breadth;
	
	Rectangle(int l, int b){
		length = l;
		breadth = b;
	}
      public int Area() {
    	int  area = length*breadth;
    	  return area;
    	  }
      public void getArea() {
		System.out.println("Area of Rectangle "+Area()); 
      }
      public static void main(String []args) {
    	  Rectangle rect1 = new Rectangle(4,5);
    	  System.out.println("length "+rect1.length);
    	  System.out.println("breadth "+rect1.breadth);
    	  rect1.getArea();
    	  
    	  Rectangle rect2 = new Rectangle(5,8);
    	  System.out.println("length "+rect2.length);
    	  System.out.println("breadth "+rect2.breadth);
    	  rect2.getArea();
    	  
    	  
      }
}
