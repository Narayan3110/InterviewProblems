package Strings;

public class SwapWords {
	
	public static void main(String [] args) {
		String s1 = "Hello";
		String s2 ="World" ;
		
		swapWords(s1,s2);
		
	}
	
	static void swapWords(String s1 , String s2) {
		
		s1 = s1+s2;
		System.out.println(s1);
		s2 = s1.substring(0 , s1.length()-s2.length());     
		s1 = s1.substring(s2.length());
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
	
	static void swapWords1(String s1 , String s2) {
		
	}
}
