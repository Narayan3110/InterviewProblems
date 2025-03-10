
//Numbers like 123 so o/p ---> 1^3 + 2^3 + 3^3
public class ArmstrongNumbers {

	
public static void main(String[] args) {
	int n = 9474 ;
	isArmStrong( n);
	}
static boolean isArmStrong(int n) {
	
//	int power = count(n);
	int og = n ;
	int sum = 0 ;
	int digits = count(n);
	while( n > 0) {
		int last  = n % 10 ; //3
		sum += Math.pow(last, digits) ;
		n = n /10 ;
	}
	if(og == sum) {
		System.out.println("Armstrong "+sum +" "+ og);
		return true ;
	}
	
	System.out.println("Not armstrong "+sum +" "+ og);
	return false;
	
}

static int count(int n) {
	int result = 0 ;
	while(n > 0) {
		n = n / 10 ;
		result++;
	}
//	System.out.println(result);
	return result;
}
	
}
