package com.days30;

import java.util.HashMap;
import java.util.Map;

public class Fibonacii {
	public Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
	public static void main(String[] args) {
	 
	 

}
	 public int getFibonacciNumberTopDown(int n) {
		    if(hm.containsKey(n)) return hm.get(n);
		    if(n == 0) return 0;
		    if(n == 1) return 1;
		    int nthValue = getFibonacciNumberTopDown(n - 1) + getFibonacciNumberTopDown(n - 2);
		    hm.put(n, nthValue);
		    return nthValue;
		  }
	 }
