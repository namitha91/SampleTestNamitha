package com.comviva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SpeechRecognitionSystem {
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
		for (String string1 : ss) {
			internalList2 = new ArrayList<>();
			if (string1.equals("*")) {
				Iterator<String> it = input.iterator();
				while (it.hasNext()) {
					String tag = (String) it.next();
					internalList2.add(tag);
					internalList2.add("PPN");
					neww.add(internalList2);
					it.remove();
					break;
				}

			} else {
				internalList2.add(string1);
				internalList2.add("others");
				neww.add(internalList2);

			}
		}

		System.out.println("final List values-->" + neww);
	}

}
