package Strings;

public class PalindromeString {
	public static void main(String[] args) {
		
		String s = "dad" ;
		System.out.println(isPalindrome(s));
		isPalindrome1(s);
	}
	
	static boolean isPalindrome(String s) {

		int start = 0 ;
		int last = s.length()-1;
		
		while(start < last) {
			if(s.charAt(start) ==s.charAt(last)) {
				start++;
				last--;
			}else {
				return false;
			}
		}
		
		
		
		return true ;
	}
	
	
	static void isPalindrome1(String s) {
		String og = s ;
		String rev = new StringBuilder(s).reverse().toString();
		if(og.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
}
