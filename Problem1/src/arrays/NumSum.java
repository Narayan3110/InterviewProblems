package arrays;

public class NumSum {
	public static void main(String[] args) {
		 String[] arr = {"2","3","$","@","5"};
		 System.out.println(digitSum(arr));
	}
	
	static int digitSum(String[] arr) {
		int sum = 0 ;
		for(String a : arr) {
			try {
				sum += Integer.parseInt(a);
			}catch(Exception ex) {
				
			}
		}
		
		return sum ;
	}
	
	

}
