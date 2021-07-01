package com.leetcode;

import java.util.Iterator;
import java.util.function.Predicate;

public class DetectCapital {
	
	//TIME COMPLEXITY O(N)
	public boolean detectCapital(String word) {
		int noOfCapitals=0;
		for (int i = 0; i < word.length(); i++) {
			if(Character.isUpperCase(word.charAt(i))) {
				noOfCapitals++;
			}
			
		}
		if(word.length()==noOfCapitals || noOfCapitals==0) return true;	
		return noOfCapitals==1 && Character.isUpperCase(word.charAt(0));
	}
	
	public boolean detectCapitalMethod2(String word) {
		if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
		for(int i=2;i<word.length();i++) {
			
				if(Character.isLowerCase(word.charAt(i))) {
					return false;
				}
			}
		}
	else {
			for(int i=1;i<word.length();i++) {
				if(Character.isUpperCase(word.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}	
	
	
	public boolean detectCapitalMethod3(String word) {
		if(word.length()<=1) return true;
		Predicate<Character> correctCase= Character::isLowerCase;
		if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
		correctCase=Character::isUpperCase;
		}
	else {
			for(int i=1;i<word.length();i++) {
				if(!correctCase.test(word.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}	
	

}
