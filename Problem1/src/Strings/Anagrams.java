package Strings;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		String s1 = "silendt";
		String s2 ="lissesn";
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Anagaram");
			return ;
		}
		
		char[] c1 = s1.toCharArray(); 
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		int i = 0 ; 
		while(i < c1.length) {
			if(c1[i] == c2[i]) {
				i++;
			}else {
				System.out.println("Not an anagram");
				return ;
			}
		}
		
		System.out.println("Anagram");
	}
}
