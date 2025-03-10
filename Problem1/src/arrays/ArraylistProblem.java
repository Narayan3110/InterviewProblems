package arrays;

import java.util.ArrayList;

public class ArraylistProblem {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(90);
		list.forEach(n->{System.out.println(n);});
		System.out.println(list);
	}
}
