package Strings;

import java.util.LinkedHashSet;
import java.util.Set;


public class UniqueCharachters {
	public static void main(String[] args) {
		
		unique("Narayan");
		
		System.out.println(unique1("Hello"));
		
	}
	
	
	static void unique(String s) {
		Set<Character> list = new LinkedHashSet<>();
		for(int i = 0 ; i<s.length();i++) {
			list.add(s.charAt(i));
		}
	
		System.out.println(list);
	}
	
	static String  unique1(String s) {
		Set<Character> list = new LinkedHashSet<>();
		for(int i = 0 ; i<s.length();i++) {
			list.add(s.charAt(i));
		}
		
		StringBuilder result = new StringBuilder();
		for(char c : list) {
			result.append(c);
		}
		return result.toString();
		
	}
}
