package com.comviva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpeechRecogniitonSystem1 {
	public static void main(String[] args) {
		String given = "Namitha Nagampurath Nam works in Wells Fargo Ltd Bangalore Office";
		List<String> input = new ArrayList(Arrays.asList("Namitha Nagampurath Nam", "Wells Fargo Ltd","Bangalore"));
		for (String tag : input) {
			if (given.contains(tag)) {
				given = given.replace(tag, "*");
			}

		}
		System.out.println(given);
		List<List<String>> neww = new ArrayList<>();
		List<String> internalList2 = null;
		String[] ss = given.split(" ");
		
		for (String string : input) {
			for (String string2 : ss) {
				
			}
		}
		
	}

}
