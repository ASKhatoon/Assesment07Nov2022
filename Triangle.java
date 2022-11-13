
public class  Triangle {
	double length;
	double breadth;
	double height;
	
	Triangle(double b,double h){
	 this.breadth = b;
	 this.height = h;
	}
	
     public double setArea() {
    double	 area = (breadth*height)*0.5;
    return area;
     }
  
    	public void getArea1() {
    		System.out.println("Area of Triangle : "+setArea());
    	}
    	Triangle(double l,double b,double h){
    		 this.breadth = b;
    		 this.height = h;
    		 this.length = l;
    		}
    		
    	     public double setPerimeter() {
    	    double	 perimeter = (breadth*height*length)*0.33;
    	    return perimeter;
    	     }
    	  
    	    	public void getArea2() {
    	    		System.out.println("Perimeter of Triangle : "+setPerimeter());
    	    	}
    	    	public static void main(String []args) {
    	    	Triangle t1 = new Triangle(1,9);
    	    	t1.getArea1();
    	    	Triangle t2 = new Triangle(1,4,7);
    	    	t2.getArea2();
    	    	}
}