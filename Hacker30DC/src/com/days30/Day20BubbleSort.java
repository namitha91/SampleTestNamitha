package com.days30;

public class Day20BubbleSort {
	   static void bubbleSort(int[] arr) {
	      int n = arr.length;
	      int temp = 0;

	      for(int i = 0; i < n-1; i++) {
	         for(int j=0; j < (n-1); j++) {
	            if(arr[j] > arr[j+1]) {
	               temp = arr[j];
	               arr[j] = arr[j+1];
	               arr[j+1] = temp;
	            }
	         }
	      }
	   }
	   public static void main(String[] args) {
	      int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		  //int arr[] = { 5,4,3,2,1};
	      System.out.println("Array Before Bubble Sort");

	      for(int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      System.out.println();
	      bubbleSort(arr);
	      System.out.println("Array After Bubble Sort");

	      for(int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	   }
	}

