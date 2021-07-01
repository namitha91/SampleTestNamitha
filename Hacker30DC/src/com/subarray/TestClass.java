package com.subarray;

import java.io.*;
import java.math.BigInteger;
import java.util.*;



public class TestClass {
    static final int INT_BITS = 32;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            long X = Long.parseLong(br.readLine().trim());
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }

            long out_ = solve(X, N, A);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static long solve(long X, int N, int[] A){
       // Write your code here
        long result = 0;
        List<Long> l=new ArrayList<>();
        List<Long> list=new ArrayList<Long>();
        long[] finalResult=new long[N];
        for(int i=0;i<N;i++){
        	
        finalResult[i]=(X >> A[i]) | (X << (INT_BITS - A[i]));
        list.add(finalResult[i]);
    }
    Collections.sort(list);
    result=list.get(0);
        return result;
    
    }
    
    static void printSubsequences(int N,int[] A)
	{
		/* Number of subsequences is (2**n -1)*/
		int opsize = (int)Math.pow(2, N);
	
		/* Run from counter 000..1 to 111..1*/
		for (int counter = 1; counter < opsize; counter++)
		{
			for (int j = 0; j < N; j++)
			{
				/* Check if jth bit in the counter is set
					If set then print jth element from arr[] */
	
				if (BigInteger.valueOf(counter).testBit(j))
					System.out.print(A[j]+" ");
			}
			System.out.println();
		}
	}
    
    
}