package com.days30;

import java.util.Scanner;

public class ClaculatePower {

	

		public static void main(String[] args) {
		    
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        while (t-- > 0) {
	        
	            int n = in.nextInt();
	            int p = in.nextInt();
	            //Calculator1 myCalculator = new Calculator1();
	            try {
	                int ans = ClaculatePower.power(n, p);
	                System.out.println(ans);
	            }
	            catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	        }
	        in.close();
	    }

		private static int power(int n, int p) throws Exception {
			// TODO Auto-generated method stub
			if(n<0 || p<0) {
				throw new Exception("n and p should be non-negative");
			}
			if(p==0 )
				return 1;
			return n*power(n,p-1);
		}
		
	
}
