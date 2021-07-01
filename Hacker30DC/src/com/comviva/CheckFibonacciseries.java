package com.comviva;

import java.util.Arrays;

public class CheckFibonacciseries {

	
	public static void main(String[] args) 
	{
	    int arr[] = { 8, 3, 5, 13 }; 
	    int n = arr.length; 
	      
	    if (checkIsFibonacci(arr, n)) 
	        System.out.println("Yes");
	    else
	        System.out.println("No"); 
	}

	private static boolean checkIsFibonacci(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n<=2) {
			return false;
		}
		Arrays.sort(arr);
		for (int i = 2; i < arr.length; i++) {
			if(arr[i-1]+arr[i-2]!=arr[i])return false;
			
		}
		return true;
		
	}
	}

