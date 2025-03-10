package Strings;

public class ReverseString {
	public static void main(String[] args) {
		
		String name = "Hello Everyone" ;
		
		reverse(name);
		
		System.out.println();
		
		reverse1(name);
		
		reverse2(name);
	}
	
	static void reverse(String name ) {
		int size = name.length();
		for(int i = size-1 ; i >= 0 ; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.print(" ");
	}
	
	static void reverse1(String name ) {
		StringBuilder sb = new StringBuilder(name);
		System.out.println(sb.reverse().toString()); 
	}
	
	static void reverse2(String name ) {
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse().toString()); 
	}
}
