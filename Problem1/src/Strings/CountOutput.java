package Strings;
import java.util.HashMap ;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOutput {
	public static void main(String[] args) {
	
		String s = "aabbcccdd" ;     // o/p -> a2b2c3d2
		
		HashMap<Character , Integer> hm =  new LinkedHashMap<>();
		
		for(char c : s.toCharArray()) {
			hm.put(c, 	hm.getOrDefault(c, 0)+1);
		}
		
		
		for(Map.Entry<Character, Integer> map : hm.entrySet()) {
			
			System.out.print(map.getKey()+""+map.getValue());
		}
		
	}
	
	
}
