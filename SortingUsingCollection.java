package week3.day2.classassignments;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {
	
	public static void main(String[] args) {

		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		System.out.println("Input values:\t\n"+Arrays.toString(input)); 
		int len = input.length;
		System.out.println("Length of an Array:\t"+len);
		Set<String>	set = new TreeSet<>();
		Set<String>	revinput = new TreeSet<>();
		for (String string1 : input) {
			set.add(string1);
		}
		System.out.println("Arranged Set:\t\n"+ set);
		revinput = ((TreeSet<String>) set).descendingSet();
		System.out.println("Output:\t\n"+revinput);
		}

}
