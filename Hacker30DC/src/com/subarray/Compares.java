package com.subarray;

import java.util.Arrays;
import java.util.Comparator;

public class Compares {

	public static void main(String[] args) {
		String[] cities= {"Bangalore","Pune","San fransicsco","New york"};
		Mysort ms=new Mysort();
Arrays.sort(cities,ms);
		
		
	}
}

static class Mysort implements Comparator{

	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		return b.compareTo(a);
	}

	

	
}