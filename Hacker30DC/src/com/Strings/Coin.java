package com.Strings;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Coin {
	private static Integer[] candidates={1, 2, 5};
	private List l=new ArrayList<>(Arrays.asList(candidates));

    public List<List<Integer>> combinationSum(Integer[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        recursive(result,new ArrayList<>(),candidates,target,0,0);
        return result;
    }
  
    //backtracking
    private void recursive(List<List<Integer>> result, List<Integer> combination, Integer[] candidates, int target, int sum, int start){
     
        if(sum==target){
        //	System.out.println("Nma"+l);
        //	System.out.println("------------");
        	if(combination.containsAll(l) ) {
            result.add(new ArrayList<>(combination));
            System.out.println(combination);
        	}
            return;
        	
        }
       
        if(sum>target) return;
        for(int i=start;i<candidates.length;i++){
            combination.add(candidates[i]);
            recursive(result,combination,candidates,target,sum+candidates[i],i);
            combination.remove(combination.size()-1);
        }
    }
    public static void main(String[] args) { 
    	
    //    List<List<Integer>> list = new CombinationSum().combinationSum(new int[]{2, 3, 5}, 8);
     //   System.out.println(list);
    	Coin c=new Coin();
    	
    	int target=10;
        List<List<Integer>> list = new ArrayList<>();
        list=c.combinationSum(candidates, target);
        if(!list.isEmpty())		
        System.out.println("Namiths"+list);
        else
        	System.out.println(0);
        
        
//        Integer arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        List<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr1));
//        System.out.println("haha"+lst.size());
//        Iterator it=lst.iterator();
//        while(it.hasNext()) {
//        	//System.out.println("Ra"+it.next());
//        }
//        
    }
    
    
}