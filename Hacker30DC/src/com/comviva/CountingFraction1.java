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



class Result1111 {

    /*
     * Complete the 'countProperFractions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER max_d as parameter.
     */

    public static int countProperFractions(int max_d) {
    	 //int N = 1000000;
         int[] phi = new int[max_d + 1];
         for(int i = 0; i < phi.length; i++) {
             phi[i] = i;
         }
         for(int i = 2; i <= max_d; i++) {
             if(phi[i] == i) {
                 for(int k = 1; k * i <= max_d; k++) {
                     phi[k * i] -= phi[k * i] / i;
                 }
             }
         }
         int[] sums = new int[phi.length];
         for(int i = 2; i <= max_d; i++) {
             sums[i] = sums[i - 1] + phi[i];
         }
         return sums[max_d];
    }
  

}

public class CountingFraction1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int max_d = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result1111.countProperFractions(max_d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
