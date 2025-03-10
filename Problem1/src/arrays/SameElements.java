package arrays;

public class SameElements {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5} ;
		int arr2[] = {4,5,6,7,8} ;
		
		same(arr1, arr2);
		
	}
	
	
	static void same(int arr1[] , int arr2[]) {
		for(int num : arr1) {
			
			for(int j = 0 ; j <arr2.length-1 ; j++) {
				if(arr2[j] == num) {
					System.out.print(num+" ");
				}
			}
			
		}
	}
}
