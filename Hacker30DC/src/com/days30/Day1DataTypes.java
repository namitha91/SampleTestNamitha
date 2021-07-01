package com.days30;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1DataTypes {
	
	


		
	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        int intValue=i+scan.nextInt();
	        double doubValue=d+scan.nextDouble();
	        String strvalue=scan.nextLine();
	        String strvalue1=scan.nextLine();
	      //  System.out.println(strvalue);
	     //   System.out.println(strvalue1);
	        //scan.close();

	        /* Declare second integer, double, and String variables. */

	        /* Read and save an integer, double, and String to your variables.*/
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

	        /* Print the sum of both integer variables on a new line. */
	System.out.println(intValue);
	System.out.println(doubValue);
	System.out.println(s.concat(strvalue1));

	        /* Print the sum of the double variables on a new line. */
			
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */

	        scan.close();
	    }	
}
