package arrays;


import java.util.* ;
public class TwoSum {
	public static void main(String[] args) {
		int arr[] = { 5 , 3, 4 ,7 , 11 } ;
		int target = 7 ;
		System.out.println(Arrays.toString(findPair(arr , target )));
	}
	
	static int [] findPair(int arr[] , int target) {
		HashMap<Integer , Integer> hm = new HashMap<>();
		for(int i = 0 ; i < arr.length ;i++) {
			int required = target - arr[i] ;
			
			if(hm.containsKey(required)) {
				return new int[] {hm.get(required) , i } ;
			}
			hm.put(arr[i], i);
		}
		return new int [] {-1 , -1} ;
	}
}
