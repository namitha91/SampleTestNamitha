package com.comviva.threadLocal;

public class ststicBlocks {
	static {
		code(2);
	}
	public static void main(String[] args) {
		
	}
	 static void code(int i) {
		// TODO Auto-generated method stub
		System.out.println(i+ " ");
	}
	 ststicBlocks(){
		 code(5);
	 }
	 static {
			code(4);
		}
	 {
			code(6);
		}
static {
	new ststicBlocks();
}
{
	code(8);

}
}