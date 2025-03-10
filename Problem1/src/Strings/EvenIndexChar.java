package Strings;

public class EvenIndexChar {
	public static void main(String[] args) {
		String s = "Automation" ;
		evenIndex(s);
		
	}
	
	static void evenIndex(String s) {
		char[] c  = s.toCharArray();
		for(int i = 0 ; i < c.length-1 ; i++) {
			if(i % 2 == 0) {
				System.out.print(c[i]);
			}
		}
	}
}
