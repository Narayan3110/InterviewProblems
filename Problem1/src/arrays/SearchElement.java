package arrays;

import java.util.Arrays;

public class SearchElement {
	public static void main(String[] args) {
		
		int[] array = {5, 2, 9, 1, 6, 3,16};
		Arrays.sort(array);
		int target = 116;
		binarySearch(array ,target) ;
	} 
	
	
	static void brutForce(int[] array , int target) {

		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] == target) {
				System.out.println("found the target at postion =  " + (i+1));
				return ;
			}
		}
	System.out.println("Not Found !!");
		
	}
	
	
	static void binarySearch(int[] arr , int target) {
		int first = 0;
		int last = arr.length ;
		while(first <= last) {
			int middle = first +(-first+last)/ 2 ;			
				if(arr[middle ]==target) {
					System.out.println("Found");
				}
				if(target > arr[middle]) {
					first = middle ;
				}else {
					last = middle-1 ;
				}	
		}
		
	}
	 
}
