package week3.day2.assignments;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PrintDuplicatesInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer> list = new ArrayList<>(arr.length);
		 
        for (int i: arr) {
            list.add(Integer.valueOf(i));
        }
 
        System.out.println("Input: \t "+list);
		System.out.println("Size: \t "+list.size());
		 HashSet<Integer> orgSet = new HashSet<>();
	     HashSet<Integer> dupSet = new HashSet<>();
	     for (Integer integer : list) {
	        if(!orgSet.add(integer)) {
	           dupSet.add(integer);
	        }
	     }
	     System.out.println("Duplicate integers are: \n\t " + dupSet);

	}

}
