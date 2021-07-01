package com.dynamic.programming;

public class ClimbingStairs {
	public int climbStairs(int n) {
        int [] dp=new int[n+1];//n+1 is for 0th base case
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
