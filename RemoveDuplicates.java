package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] text1 = text.split(" ");
		System.out.println("Input text:\t"+Arrays.toString(text1));
		ArrayList<String> org = new ArrayList<String>();
		ArrayList<String> dup = new ArrayList<String>();
		for(int i=0;i<text1.length;i++) {
			org.add(text1[i]);
			dup.add(text1[i]);
			}
		for (String string : dup) {
			if(string.equals("java")) {
				count++;
			}if(count>=1) {
				org.remove("java");
			}
		}
		System.out.println("Output: \t"+org);
	}

}
