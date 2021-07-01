package com.comviva;

public class ReversStringArray {
	public static void main(String[] args) {
		String[] given = new String[] {"Namitha Nagampurath Nam", "works", "in", "Wells Fargo Ltd", "Bangalore", "Office"};
		StringBuilder[] reverseArray=new StringBuilder[given.length];
		StringBuilder revers=new StringBuilder();
		for (int i = given.length-1; i >=0 ; i--) {
			revers.append(given[i]+" ");
			
		}
		System.out.println(revers.toString());
		//for (StringBuilder string : revers) {
			System.out.println();
		//}
	

	
	for (int i = given.length-1; i >=0 ; i--) {
	//	reverseArray[i].(given[i]);
		
	}
	for (StringBuilder stringBuilder : reverseArray) {
		System.out.println(stringBuilder);
	}
	}
}
