package com.comviva;

public class fibonacci {

	public static void main(String[] args) {
		int result=fib(2);
		int wr=withoutrec(14);
	//	System.out.println(result);
		
		System.out.println("without recursion "+wr);
	}
private static int withoutrec(int n) {
		// TODO Auto-generated method stub
	int fib1=0,fib2=1,fib3=0;
	if(n==0 || n==1)
		return n;
	
	for (int i = 2; i <= n; i++) {
		fib3=fib1+fib2;
		fib1=fib2;//0
		fib2=fib3;//1
	}
	return fib3;
	}
//0,1,1,2,3,5
	private static int fib(int n) {
		// TODO Auto-generated method stub
		
		if(n==0 || n==1)
			return n;
		return fib(n-1)+fib(n-2);
		
		
	}
}
