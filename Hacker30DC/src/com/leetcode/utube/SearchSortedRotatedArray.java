package com.leetcode.utube;

public class SearchSortedRotatedArray {

	    public int search(int[] nums, int target) {
	        int size=nums.length;
	        int mid;
	     
	        int low=0,high=size-1;
	        while(low<=high){
	          mid=(low+high)/2;
	            if(nums[mid]==target)
	                return mid;
	           else if(nums[mid]>=nums[low]){
	                  
	                if(target>=nums[low] && target<=nums[mid])
	                    high=mid-1;
	                else
	                    low=mid+1;
	                
	            }else{
	            
	               if(target>=nums[mid] && target<=nums[high])
	                low=mid+1;
	               else
	                high=mid-1;
	            }
	        }
	        
	        return -1;
	    }
	}

