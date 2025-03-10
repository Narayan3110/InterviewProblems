
public class ReverseNumber {

	
	public static void main(String[] args) {
		reverse(123456);
	}
	
	static void reverse(int n) {		
		int rev = 0 ;
		while(n > 0) {
			int last = n % 10 ;
			rev = rev * 10 + last ;
			n = n /10 ;
		}
		
		System.out.println(rev);
	}
}
