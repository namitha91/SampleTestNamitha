package com.comviva.threadLocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUSingExecService {
	
	public static ThreadLocal<SimpleDateFormat> threadSafeFormtter=new ThreadLocal<SimpleDateFormat>() {
		public SimpleDateFormat initialValue() {
			return new SimpleDateFormat("YYYY-MM-DD");//called once for each thread
			
		}
		
		public SimpleDateFormat get() {
			return super.get();//1st call=initialvslue and subsequent calls willl return same initialized value
		}
		
	};
		
	 class ThreadSafeFormatter{
		public static final ThreadLocal<SimpleDateFormat> df=ThreadLocal.withInitial(()-> new SimpleDateFormat("YYYY-MM-D"));
	}
	//by using java 8 factory method 		ThreadLocal.withInitial

	


	public static void main(String[] args) throws InterruptedException {
		//ExecutorService es=Executors.newFixedThreadPool(10);
	}
	
	/* we need a middle ground where each thread has its own dateformat object
	 * and this concept of javing variables specific ti a thrad
	 * 10thread=10dateformate obj
	 * */
		
	private String getBirthDate(int id) {
		// TODO Auto-generated method stub
		Date bdate=getBirtDatebyId(id);
	//	SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
		final SimpleDateFormat df=ThreadPoolUSingExecService.threadSafeFormtter.get();//each thread will get its own copy
		return df.format(bdate);
	}

	private Date getBirtDatebyId(int id) {
		// TODO Auto-generated method stub
		return new Date(System.currentTimeMillis());
	}
	
	
	/*
	 * //use case2:
	 * RequestContextHolder -to store any of the request qttributes throughout the scope of a particular request and the request in spring is handled by a single thread
	 * so, any time in the class during the flow
	 * 
	 * SecurityConextHolder-->has the current user
	 * UserContextHolder.holder.remove(); if we are creating custom userContext holder
	 */	
	
	
}
