package com.days30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInArray {
	
	
	public static void main(String[] args) {
		
		
		//Solution1
		String[] names = { "Java","JavaScript", "JavaScript", "Python","Java" ,"C", "Ruby", "Java" };
		List<String> values=Arrays.asList(names);
		List<String> collect = values.stream().distinct().collect(Collectors.toList());
		Iterator itr= collect.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		//solution2
		//Set<String> setNames=new HashSet<String>(Arrays.asList(names));
		System.out.println("before removing1"+names.length);
		Set<String> setNames=new HashSet<String>();
		for (String value : names) {
			if(setNames.add(value)==false) {
				System.out.println(value);
			}
			
		}
		Set<String> setNames1=new HashSet<String>();
		System.out.println("before removing2"+names.length);
		for(int i=0;i<names.length;i++) {
			if(setNames1.add(names[i])==false) {
				System.out.println(names[i]);
			}
		}
		
		
		
		System.out.println("Duplicate elements from array using hash table"+names.length); 
		Map<String, Integer> nameAndCount = new HashMap<>();
		//int count=0;
		for (String key : names) {
			if(nameAndCount.containsKey(key)) {
				nameAndCount.put(key, nameAndCount.get(key)+1);
			}else {
				nameAndCount.put(key, 1);
			}
			
		}
		Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
		for(Map.Entry<String,Integer> map:entrySet) {
			if(map.getValue()>1)
			System.out.println(map.getKey()+":"+map.getValue());
			
		}
		//nameAndCount.put(key, value)

	}

}
