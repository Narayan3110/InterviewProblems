package arrays;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		
		int arr[] = {2,6,4,5,7,9,1,3};
		
//		selectonSort(arr);
		bubbleSort(arr);
	}
	
	
	static void selectonSort(int arr[]) {
		int count= 0;
		//swap small element with max element and then swap 
		for(int i = 0 ; i < arr.length-1 ;i++) {
			
			for(int j =i+ 1 ; j < arr.length  ; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
				
				count++;
				
			}
		}
		System.out.println("Steps-> " +count);
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void bubbleSort(int arr[]) {
		int count = 0 ;
		//adjacent element 
		for(int i = 0 ; i < arr.length ; i++) {
			
			for(int j = 1 ; j < arr.length-i ; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp ;
					count++;
				}
				System.out.println(Arrays.toString(arr));
			}
			
		}
		System.out.println("Steps-> " +count);
		
		System.out.println(Arrays.toString(arr));
	}

	static void mergeSort(int arr[]) {
		
	}
}


