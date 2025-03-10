package Strings;

public class CountWord {
	public static void main(String[] args) {
		
		String s ="Narayan has completed CDAC" ;
		
		String [] words = s.split(" ");
		
//		for(String a : words) {
//			System.out.println(a);
//		}
		
		System.out.println("Number of Words are = "+ words.length );
	}
	

}
