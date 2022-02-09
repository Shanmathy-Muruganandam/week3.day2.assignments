package week3.day2.assignments;

import java.util.LinkedHashSet;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int[] arr1 = {3,2,11,4,6,7};	
		int[] arr2 = {1,2,8,4,9,7};
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set1.add(arr1[i]);
		}
		System.out.println("Array1: \t "+set1);
		for(int j=0;j<arr2.length;j++) {
			set2.add(arr2[j]);
		}
		System.out.println("Array2: \t "+set2);
		set1.retainAll(set2);
		System.out.println("Intersection: \t "+set1);
	}

}
