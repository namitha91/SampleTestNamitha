package com.comviva;

import java.io.*;
import java.util.*;


public class subArrayGreaterThanK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            int K = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            long[] A = new long[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Long.parseLong(arr_A[i_A]);
            }

            int out_ = solve(N, K, A);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static int solve(int N, int K, long[] A){
       // Write your code here
       
        //int result = 0;

        //return result;
        int result = 0;
        for (int start = 0; start < A.length; start++) {
            for (int end = start + 1; end <= A.length; end++) {
                int sum = 0;
                for (int i = start; i < end; i++)
                    sum += A[i];
                if (sum >= K)
                    result++;
            }
        }
        return result;
    }
    
    }
