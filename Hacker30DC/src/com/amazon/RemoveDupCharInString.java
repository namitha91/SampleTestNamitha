package com.amazon;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupCharInString {
	public static void main(String[] args) {
		String s="abbagaba";
		Set<Character> uniqueStirng=new HashSet<Character>();
		char[] cArray=s.toCharArray();
		for (char c : cArray) {
			uniqueStirng.add(c);
		}
		System.out.println(uniqueStirng);
		System.out.println(uniqueStirng.toString());
	}

}
