package com.comviva;

public class HackerEarthMain {

	
	public static void main(String[] args) {
		
		//	new B2(2,3).add();
		
		HackerEarth obj1=new HackerEarth();
		Hacker obj2=new Hacker();
		((HackerEarth)obj2).print();
		obj1=obj2;
		obj1.print();
		
		}

}

class HackerEarth{
	public void print() {
		System.out.println("Inside HAckerEarth");
	}
}

class Hacker extends HackerEarth{
	
	public void print() {
		System.out.println("Inside Hacker");
	}
	
}
