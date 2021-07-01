package com.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {
	
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(10,20);
	//	List<Integer> list1=Arrays.asList(10,20,21,28,47);
		List<Integer> list2=Arrays.asList(1,15,17,19,43);
		int[] a= {10};
		//int[] a= {10,20,21,28,47};
		int [] b= {1,15,17,19,43};
		//int totallength=0;
		int i=0,j=0;
		List<Integer> result=new ArrayList();
		while(i<a.length && j<b.length) {
			if(a[i]<b[j] ) {
				result.add(a[i]);
				i++;
			}else if(a[i]>b[j] ){
				result.add(b[j]);
				j++;
			}
			//totallength++;
		}
		while(i<a.length) {
			result.add(a[i]);
			i++;
		}
		while(j<b.length) {
			result.add(b[j]);
			j++;
		}
		System.out.println(result);
	}
	
	//better solution
	void merge(int A[], int m, int B[], int n) {
        int i=m-1;
		int j=n-1;
		int k = m+n-1;
		while(i >=0 && j>=0)
		{
			if(A[i] > B[j])
				A[k--] = A[i--];
			else
				A[k--] = B[j--];
		}
		while(j>=0)
			A[k--] = B[j--];
    }
}
