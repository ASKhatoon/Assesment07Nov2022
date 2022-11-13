package java8;

@FunctionalInterface
interface AcceptValues{
	
   public int show(int x, int y) ;
	  
}

public class LambdaExpression {

	public static void main(String[] args) {
		AcceptValues object = (a,b) -> System.out.println("Multiplication of "+a+" and "+y+" is "+(a*b));
		object.show(2,3);
		
	}

}
