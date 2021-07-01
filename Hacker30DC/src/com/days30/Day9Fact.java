package com.days30;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day9Fact {

    // Complete the factorial function below.
    static int factorial(int n) {
        if(n==0)
        return 1;
        return n*factorial(n-1);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(bufferedWriter);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        System.out.println(result);

      

        scanner.close();
    }
    
    public static int fact(int n) {
    	if(n==0 || n==1)
    		return 1;
    	return n*fact(n-1);
    }
}
