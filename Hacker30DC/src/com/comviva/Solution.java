package com.comviva;

//Java program to check if the elements of
//a given array can form a Fibonacci Series
import java. util. Arrays;

class Solution{
	
//Returns true if a permutation
//of arr[0..n-1] can form a
//Fibonacci Series
public static boolean checkIsFibonacci(int arr[],
									int n)
{
	if (n == 1 || n == 2)
		return true;
	
	// Sort array
	Arrays.sort(arr);
	
	// After sorting, check if every
	// element is equal to the sum
	// of previous 2 elements
	for(int i = 2; i < n; i++)
	{
	if ((arr[i - 1] + arr[i - 2]) != arr[i])
		return false;
	}
	return true;
}
	
//Driver code
public static void main(String[] args)
{
	int arr[] = { 8, 2};
	int n = arr.length;
	
	if (checkIsFibonacci(arr, n))
		System.out.println("Yes");
	else
		System.out.println("No");
}
}

//This code is contributed by divyeshrabadiya07
