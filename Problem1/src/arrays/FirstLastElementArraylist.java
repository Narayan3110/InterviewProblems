package arrays;
import java.util.*;

public class FirstLastElementArraylist {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Narayan");
		list.add("Ram");
		list.add("Shyam");
		list.add("isha");
		list.add("Saumya");
		
		first(list);
		last(list);
			
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
	}
	
	static void first(ArrayList<String> list) {
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
	}
	static void last(ArrayList<String> list) {
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
	}
	
	
	
}
