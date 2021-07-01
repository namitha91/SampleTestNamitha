package com.subarray;

/* Java code to generate all possible subsequences.
Time Complexity O(n * 2^n) */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SubArray
{
	static final int INT_BITS = 32;
static int arr[] = new int[]{1, 2, 3};

static void printSubsequences(int n)
{
	Set<Integer> s=new HashSet<Integer>();
	List<Integer> l=new ArrayList<Integer>();
	int opsize = (int)Math.pow(2, n);
	List<List<Integer>> o=new ArrayList<>();
	List<Integer> i;

	for (int counter = 1; counter < opsize; counter++)
	{
		i=new ArrayList<>();
		for (int j = 0; j < n; j++)
		{
			

			if (BigInteger.valueOf(counter).testBit(j)) {
			
			i.add(arr[j]);
			}
		}
		
		o.add(i);
	}
	
	System.out.println(o);
//	for (Integer f : o) {
//	    System.out.println("Father: " + );
//	    System.out.println("Children:");
//	    for (Children c : f.getChildrens()) {
//	        System.out.println(c.getName());
//	    }
//	}
}

static long solve(long X, int N, int[] A){
    // Write your code here
     long result = 0;
     List<Long> l=new ArrayList<>();
     List<Long> list=new ArrayList<Long>();
     long[] finalResult=new long[N];
     for(int i=0;i<N;i++){
     	
     finalResult[i]=(X >> A[i]) | (X << (INT_BITS - A[i]));
     list.add(finalResult[i]);
 }
 Collections.sort(list);
 result=list.get(0);
     return result;
 
 }
 
// Driver method to test the above function
public static void main(String[] args)
{
	System.out.println("All Non-empty Subsequences");
	printSubsequences(arr.length);
}
}
