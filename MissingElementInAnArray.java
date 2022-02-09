package week3.day2.assignments;

import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		Integer[] array = new Integer[set.size()];
	      int j = 0;
	      for (Integer i: set) {
	         array[j++] = i;
	      }
	      int n = 1;
	      for (int k = 0; k < array.length; k++) {
	  		if(n!=array[k]) {
	  			System.out.println("Missing number: \t"+n);
	  			break;
	  		}
	  		n++;
	  	}
	}

}
