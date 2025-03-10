
public class Factorial {
	
	public static void main(String [] args) {
		
		int n = 5 ;
		System.out.println(factorial(n));
		
		fact(3);
	}
	
	
	static int factorial(int n) {
		if(n == 1) {
			return 1 ;
		}
		
		return n *  factorial(n-1);
	}
	
	
	static void fact(int n) {
		int factorial = 1 ;
		
		for(int i = 1 ; i <= n ; i++) {
			factorial = factorial * i ;
		}
		
		System.out.println(factorial);
	}

}
