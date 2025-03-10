
public class SumOfDigits {
	public static void main(String[] args) {
		sumDigits(141);
	}
	
	static void sumDigits(int n) {
		int sum = 0;
		while(n > 0 ) {
			int last = n % 10 ;
			sum += last ;
			n = n / 10 ;
			
		}
		
		System.out.println("Sum of digits is " + sum);
	}
}
