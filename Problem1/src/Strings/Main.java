package Strings;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String s1 = "ACT" ;
		String s2 = "cat" ; 
		
		isValid(s1 , s2);
	}
	
	static void isValid(String s1 , String s2) {
		
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Valid");
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)){
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
		
	}
}
