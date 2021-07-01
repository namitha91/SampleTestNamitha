package com.comviva;

import java.util.HashMap;

public class B2 extends B1 {

	private B2(int a ,int b) {
		super(a, b);
		
	}
	protected int c=10;
	protected void add() {
		sum(10,20);
	}
	public static void main(String[] args) {
		HashMap<String, Integer> hm = 
                new HashMap<String, Integer>();

   // Adding mappings to HashMap
   hm.put("GeeksforGeeks", 54);
   hm.put("A computer portal", 80);
   hm.put("For geeks", 82);
   hm.put("GeeksforGeeks", 20);

   // Printing the HashMap
   System.out.println("Created hashmap is" + hm);	
	}
}
class B1{
	private int a=10;
	private int b=30;
	public B1(int a,int b) {
		this.a=a;
		this.b=b;
		
	}
	
	protected void sum(int a,int b) {
		new B1(a,b).get();
		
	}
	private void get() {
		System.out.println(a+b);
	}
	
	
}
