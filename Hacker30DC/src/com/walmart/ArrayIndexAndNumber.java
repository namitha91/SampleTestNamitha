package com.walmart;

public class ArrayIndexAndNumber {
	
	//Rearrange an array such that arr[i] = i
	public static void main(String[] args) {
		int arr[]= {-1,-1,6,1,9,3,2,-1,4,-1};
		int result[] =new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					result[i]=i;
					break;
				}else
					result[i]=-1;
			}
		//	if(arr[j]!=i) {
		//		result[i]=-1;
		//	}
		}
		for (int i : result) {
			System.out.println(i);
		}
		
	}

}
