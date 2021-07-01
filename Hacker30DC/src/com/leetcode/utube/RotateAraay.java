package com.leetcode.utube;

public class RotateAraay {
	
	/*
	 * It's basically when your value of k is greater than the length of the array.
	 * Looking at a simple example, if your array is [1,2,3] and your k is 5, the
	 * final array is going to be the same even if you reverse it 2 times (which is
	 * equal to n%k). If you don't do this, you will get an error since you try to
	 * access an index which is out of bounds, i.e, there is no index (3,4,5) if
	 * your array size itself is only 3
	 */
	
	
	public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    
    public void reverse(int [] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
            
        }
    }
}
