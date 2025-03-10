
public class swap {
	
	public static void main(String [] args) {
		
		int a = 10 ;
		 int b = 20 ;
		 reverse3(a , b);
		
	}
	
	
	//method one 
	static void reverse1(int a , int b) {
		int temp = a ;
		a = b ; 
		b = temp ;
		
		
		System.out.println("["+a +" , "+ b+"]");
	}
	
	static void reverse2(int a , int b) {
		 a = a+b; //30
		 b = a-b ; //10
		 a = a-b ; //30-10
		
		
		System.out.println("["+a +" , "+ b+"]");
	}
	
	static void reverse3(int a , int b) {
		 a = a*b; //1000
		 b = a / b ; // 1000 / 20 => 50 
		 a = a / b ; // 1000 / 50 = > 20 
		
		
		System.out.println("["+a +" , "+ b+"]");
	}
	

}
