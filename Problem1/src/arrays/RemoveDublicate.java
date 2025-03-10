package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {
	
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,9,11,46,3,4,5,6} ;
		Set<Integer> set = new HashSet<>();
		
		for(int a : arr) {
			set.add(a);
		}
		
		int result[] = new int[set.size()];
		int i = 0 ;
		for(int ans : set) {
			result[i++] =ans ;
		}
		
		arr = result;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(result));

	}
}
