package com.amazon;

import java.util.HashSet;
import java.util.Set;

public class AddTwoArrays {
	
	public static void main(String[] args) {
		int a[]= {3,4,2,8,5};
		int b[]= {11,10,27,12,18,15};
		int m=a.length;
		int n=b.length;
		Set<Integer> s=new HashSet<Integer>();
		
		//int[] result = new int[m+n-1];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
			if(!s.contains(a[i]+b[j]) && s.size()<=m+n-1)
				s.add(a[i]+b[j]);
						
			}
		}
		System.out.println(s);
	}

}
