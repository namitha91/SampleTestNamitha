package com.comviva;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result111 {

    /*
     * Complete the 'efficientJanitor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts FLOAT_ARRAY weight as parameter.
     */
	
	 public static int efficientJanitor(List<Float> weight) {
		 
		 Float[] weights = new Float[weight.size()];
		 int i = 0;

		 for (Float f : weights) {
		     weights[i++] = (f != null ? f : Float.NaN); 
		     // Or whatever default you want.
		     //System.out.println(weights[i]);
		 }
	//double[] arr = {1.01, 1.991, 1.32, 1.4};    
    Arrays.sort(weights);
    int left = 0;
    int right = weights.length - 1;
    int count = 0;
    while(left <= right){
        if(left == right){
            count++;
            break;
        }
        if(weights[left] + weights[right] <= 3.0){
            left++;
            right--;
            count++;
        }
        else{
            right--;
            count++;
        }
    }
   return count;
}
}
public class Solution1 {
    
    
    public static void main(String[] args) {
    	Float[] weight = {(float) 1.01, (float) 1.99, (float) 2.5, (float) 1.5, (float) 1.01};
    	Float max = (float) 3.0;
    	List<Float> weights=Arrays.asList(weight);
    	System.out.println(Result111.efficientJanitor(weights));
    }
}

