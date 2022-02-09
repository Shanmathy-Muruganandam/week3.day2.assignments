package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		Set<Integer> set = new TreeSet<Integer>();
		Set<Integer> revset = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			set.add(data[i]);
		}
		//System.out.println("Input: \t	"+set);
		revset = ((TreeSet<Integer>) set).descendingSet();
		//System.out.println("Reverse:\t"+ revset);
		 List<Integer> list = new ArrayList<Integer>(revset);
		 System.out.println("2nd Largest: \t "+list.get(1));
	          
	}

}
