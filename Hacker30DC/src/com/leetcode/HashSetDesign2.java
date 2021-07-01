package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashSetDesign2 {
	int ARRAY_SIZE=100;
	List<List<Integer>> parentList;
	//List<Integer> childList;
	
	public HashSetDesign2() {
		parentList=new ArrayList<List<Integer>>();
		List<Integer> childList=new ArrayList<Integer>();
	}
	
	public void add(int key) {
		int index=key % ARRAY_SIZE;
		List<Integer> childList=parentList.get(index);
		if(childList==null) {
			List<Integer> list=new LinkedList<Integer>();
			list.add(key);
			parentList.set(index,list);
		}else {
			if(!childList.contains(key)) {
				childList.add(key);
			}
		}
	}
	public void remove(int key) {
		int index=key % ARRAY_SIZE;
		List<Integer> childList=parentList.get(index);
		if(childList.get(key)!=null){
			childList.remove(Integer.valueOf(key));
		}
			
	}
	public boolean contains(int key) {
		int index=key % ARRAY_SIZE;
		List<Integer> childList=parentList.get(index);
		
		return childList!=null && childList.contains(key);
		
		
	}
	public static void main(String[] args) {
		
	}

}
