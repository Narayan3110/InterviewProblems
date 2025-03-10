package Strings;
import java.util.*;

public class CountEachWord {
	public static void main(String[] args) {
		count("Helloo Narayan Helloo");
	}
	
	static void count(String s) {
		HashMap<String , Integer> hm = new HashMap<>();
		for(String a : s.split(" ")) {
			
			if(hm.containsKey(a)) {
				hm.put(a, hm.get(a)+1);
			}else {
				hm.put(a, 1);
			}
		}
		
		System.out.println(hm);
	}
}
