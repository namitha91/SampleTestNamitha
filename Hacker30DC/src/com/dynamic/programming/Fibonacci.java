package com.dynamic.programming;


class Fibonacci {
    public int fib(int n) {
    	//1 extra to handle case, n = 0
        int[] dp=new int[n+2];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
            
        }
        return dp[n];
    }
}