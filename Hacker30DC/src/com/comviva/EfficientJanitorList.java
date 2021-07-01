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



class Result11 {

    /*
     * Complete the 'efficientJanitor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts FLOAT_ARRAY weight as parameter.
     */
static int res = Integer.MAX_VALUE;
    public static int efficientJanitor(List<Float> weight) {
    // Write your code here
    //Float[] weights = Floats.toArray(weight);
   
//Float[] weights = ArrayUtils.toPrimitive(weight.toArray(new Float[0]), 0.0F);

Float[] weights = new Float[weight.size()];
int i = 0;

for (Float f : weights) {
    weights[i++] = (f != null ? f : Float.NaN); // Or whatever default you want.
}
    boolean[] visited = new boolean[weights.length];
    dfs(weights, visited, 0.0, 1, 3);
    return res;
    }
    
    private static void dfs(Float[] weights, boolean[] visited, double w, int tmp, double max) {
    if(tmp > res)
        return;
    if(isAllVisited(visited)) {
        res = Math.min(res, tmp);
        return;
    }
    for(int i=0;i<weights.length;i++){
        if(!visited[i]) {
            visited[i] = true;
            if(w + weights[i] <= max)
                dfs(weights, visited, w + weights[i], tmp, max);
            else
                dfs(weights, visited, weights[i], tmp+1, max);
            visited[i] = false;
        }
    }
}

private static boolean isAllVisited(boolean[] visited) {
    for(boolean v : visited)
        if(v == false)
            return false;
        return true;

}
}

public class EfficientJanitorList {
    
    	public static void main(String[] args) {
    		Float[] weights = {(float) 1.01, (float) 1.991, (float) 1.32, (float) 1.4, (float) 1.01};
    		Float max = (float) 3.0;
    		System.out.println(efficientJanitor(weights, max));
    	}
    
}
