package Assignments;

public class PositiveString {
	
	public static void main(String []args) {
		System.out.println();
		Abecedarian("ant");
		
	}
	
	public static boolean Abecedarian(String s) {
		String alpha = "";
		for(char c = 'A'; c<='Z'; c++) {
			alpha +=c;
		}
		if(s.equals(alpha)) {
			return true;
		} else {
			return false;
		}
	}
	
		
}		
