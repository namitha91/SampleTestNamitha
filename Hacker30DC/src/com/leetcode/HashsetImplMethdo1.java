package com.leetcode;

import java.util.Iterator;

public class HashsetImplMethdo1 {
	boolean[] bool;
	
	public HashsetImplMethdo1() {
		bool=new boolean[1000];
	}
	
	public void add(int key) {
		bool[key]=true;
	}
	
	public void remove(int key) {
		bool[key]=false;
	}
	
	public boolean contains(int key) {
		
		return false;
		
	}
	public static void main(String[] args) {
		
		HashsetImplMethdo1 hashsetImplMethdo1=new HashsetImplMethdo1();
		hashsetImplMethdo1.add(2);
		hashsetImplMethdo1.add(3);
		hashsetImplMethdo1.add(4);
		hashsetImplMethdo1.add(5);
		//Iterator itr=hashsetImplMethdo1();
		System.out.println(hashsetImplMethdo1.toString());
		
	}

}
