
public class Fibonaci {
	public static void main(String[] args) {
		int n = 1 ;
		series(n);
	}
	
	static void series(int n) {
		if(n < 1) {
			System.out.println("Number less than 1");
			return ;
		}
		int first = 0 ;
		int second = 1 ;
//		int sum = 0 ;
		System.out.print(first+" ");
		System.out.print(second+" ");
		for(int i = 0 ; i < n-2; i++) {
			int sum = first + second ;
			first = second ;
			second = sum ;
			
			System.out.print(sum+" ");
		}
	}
}
