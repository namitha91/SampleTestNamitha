package com.comviva.threadLocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalUSingExecService {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es=Executors.newFixedThreadPool(10);
		
		for (int i = 0; i < 10; i++) {
			es.submit(() -> {
				String date=new ThreadLocalUSingExecService().getBirthDate(10);
				System.out.println(date);
			});
			
			
			
		}
		Thread.sleep(1000);
	}
	
	/* we need a middle ground where each thread has its own dateformat object
	 * and this concept of javing variables specific ti a thrad*/
	private String getBirthDate(int id) {
		// TODO Auto-generated method stub
		Date bdate=getBirtDatebyId(id);
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
		return sdf.format(bdate);
	}

	private Date getBirtDatebyId(int id) {
		// TODO Auto-generated method stub
		return new Date(System.currentTimeMillis());
	}
	
}
