package com.twiolio;

public class KSubArrays {

}
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


class Result {

    /*
     * Complete the 'kSub' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY nums
     */

    public static long kSub(int k, List<Integer> nums) {
    // Write your code here
              Integer[] itemsArray = new Integer[nums.size()];
            itemsArray = nums.toArray(itemsArray);
            Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        long count = 0;
        int sum = 0;
        for(int a : itemsArray) {
            sum = (sum + a) % k;
            if(sum < 0) sum += k;  // Because -1 % 5 = -1, but we need the positive mod 4
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
              

    

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int numsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> nums = IntStream.range(0, numsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.kSub(k, nums);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
