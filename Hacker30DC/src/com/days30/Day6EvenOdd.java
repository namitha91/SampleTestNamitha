package com.days30;

import java.util.Scanner;

public class Day6EvenOdd {
	
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 int noOfTestCases = scan.nextInt();
		 
		 
		 for(int i=0;i<noOfTestCases;i++) {
			
			 StringBuilder evenString=new StringBuilder();
			 StringBuilder oddString=new StringBuilder();
			 char[] inputChar=scan.next().toCharArray();
			 for (int j = 0; j < inputChar.length; j++) {
				
			
			 if(j%2==0) {
				 evenString.append(inputChar[j]);
			 }else {
				 oddString.append(inputChar[j]);
			 }
			 } 
			 System.out.println(evenString+" "+oddString);
		 }
		 
		
		 
	}


}
