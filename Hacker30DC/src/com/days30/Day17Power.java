package com.days30;


import java.util.*;
import java.io.*;

//Write your code here
 class Calculator1{
     //int input=1;
public int power(int n,int p) throws Exception
{
	if(p>0) {
		
  return n*power(n,p-1) ;
	}
	return 1; 
  
}//

}
 public class Day17Power {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator1 myCalculator = new Calculator1();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}


	
	