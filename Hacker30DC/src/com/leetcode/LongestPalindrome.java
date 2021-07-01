package com.leetcode;

public class LongestPalindrome {
	int resultStart;
	int resultLength;
	
	public String checkPalindrome(String s) {
		int length = s.length();
		if(length<2) {
			return s;
		}
		for(int start=0;start<s.length();start++) {
			expandRange(s,start,start);
			expandRange(s,start,start+1);
		}
		return s.substring(resultStart,resultStart+resultLength);
	}
	
	private void expandRange(String str, int begin, int end) {
		while(begin>=0 && end<str.length() && str.charAt(begin)==str.charAt(end)) {
			begin--;
			end++;
			
		}
		//end-1-(begin+1)->end-1-begin-1-->end-begin-2-->end-begin-1--?+1 is the no of characters
		//resultLength=end-begin+1;
		if(resultLength<end-begin-1) {
			resultLength=end-begin-1;
			resultStart=begin+1;
			
			
		}
		
		
	}

	public static void main(String[] args) {
		//in one pass im 
		//going to check if each character happens to be the middle of a possible palindrome
		//im going to expand outwards untill i find 2 mismatch characters  
		//and this process is repeated for each character
		LongestPalindrome longestPalindrome=new LongestPalindrome();
		System.out.println(longestPalindrome.checkPalindrome("abcacbbcadb"));
	}

}
