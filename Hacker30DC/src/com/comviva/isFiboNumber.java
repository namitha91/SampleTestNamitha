package com.comviva;

public class isFiboNumber {
	

	public static void main(String[] args) 
	{
	    int arr[] = { 8, 3, 5, 13 }; 
	    int n = arr.length; 
	    for (int i = 0; i < arr.length; i++) {  
	    if (checkIsFibonacci(i)) 
	        System.out.println("Yes");
	    else
	        System.out.println("No"); 
	    }
	}

	private static boolean checkIsFibonacci(int n) {
		// TODO Auto-generated method stub
		
			return isPerfectSquare((5*n*n)+4) || isPerfectSquare((5*n*n)-4);
		
		
		
	}

	private static boolean isPerfectSquare(int x) {
		
		int s=(int) Math.sqrt(x);
		// TODO Auto-generated method stub
		
		return s*s==x;
		
	}

}
