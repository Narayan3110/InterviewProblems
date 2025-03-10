
public class EvenOdd {
	public static void main(String [] args) {
		int number = 11 ;
		boolean result = isEven(number);
		if(result == true) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is odd");
		}
	}
	
	static boolean isEven(int n) {
		if(n % 2 == 0) {
			return true ;
		}		
		return false;
	}
}
