
public class PrimeNumbers {
	 
	public static void main(String[] args) {
		int n = 5 ;
		boolean result = isPrime(n);
		System.out.println(result);
	}
	
static boolean isPrime(int n) 
	{
		 //prime number divisible by itself and one only
		for(int i = 2 ; i <= n / 2  ; i++) {
			if(n % i == 0 ) {
				return false ;
			}									
		}
		return true ;
	}

}
