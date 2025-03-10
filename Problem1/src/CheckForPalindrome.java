
public class CheckForPalindrome {
	public static void main(String[] args) {
		int n = 1201 ;
		System.out.println(isPalindrome(n));
	}
	
	
	static boolean isPalindrome(int n) {
		int rev = 0 ;
		int og = n ;
		while(n > 0 ) {
			int last  = n % 10 ;
			rev = rev*10 + last ;
			n = n / 10 ;
		}
		System.out.println(og +" " + rev);
		return og == rev ;
	}
	
	
	
}
