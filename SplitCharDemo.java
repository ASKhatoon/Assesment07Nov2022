package java8;

@FunctionalInterface
interface AcceptVal{
public abstract void show();
}


public class SplitCharDemo {
	public static void main(String []args) {
		AcceptVal separator = () -> {
			  String str1 = "C A T";
		 String[] arrOfStr = str1.split(" ");
		  
	        for (String charecter : arrOfStr)
	            	        separator.show();
		};
		
}
	
}	