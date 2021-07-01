package com.dynamic.programming;


	
	import java.io.*;
	import java.util.*;

	public class LongestCommonSubstring {

		public static int solution(String s1, String s2){
			//write your code here
			int max=0;
			int cache[][]=new int[s1.length()+1][s2.length()+1];
			for(int s1row=1;s1row<=s1.length();s1row++){
			    for(int s2col=1;s2col<=s2.length();s2col++){
			        if(s1.charAt(s1row-1)==s2.charAt(s2col-1)){
			            cache[s1row][s2col]=cache[s1row-1][s2col-1]+1;
			            max=Math.max(max,cache[s1row][s2col]);
			        }
			    }
			}

			return max;
		}

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String s1 = scn.next();
			String s2 = scn.next();
			System.out.println(solution(s1,s2));
		}

	}

