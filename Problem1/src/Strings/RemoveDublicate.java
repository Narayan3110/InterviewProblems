package Strings;

import java.util.HashMap;
import java.util.Map;


public class RemoveDublicate {
	public static void main(String[] args) {
		String text="This is a String text" ;
		removeDublicate(text);	
	}
	
	static void removeDublicate(String text) {
		HashMap<Character , Integer> hm = new HashMap<>();
		char[] a = text.toCharArray();
		for(char c : a) {
		hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}

}
