package arrays;
import java.util.* ;
import java.util.stream.Collectors;

public class RemoveDublicateArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list =  new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(40);
		
		RemoveDublicate1(list);
	}
	
	static void RemoveDublicate(ArrayList<Integer> list) {
		Set<Integer> uniqueList = new LinkedHashSet<>(list);
		
		System.out.println(uniqueList);
	}
	static void RemoveDublicate1(ArrayList<Integer> list) {
		List<Integer> unique = list.stream().distinct().toList();
		System.out.println(unique);
	}
}
