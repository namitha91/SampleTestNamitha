package com.comviva.threadLocal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class UsetService {
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				String date=new UsetService().getBirthDate(10);
				System.out.println(date);
			}).start();
			
			new Thread(()-> {
				String date=new UsetService().getBirthDate(20);
				System.out.println(date);
			}).start();
			
		}
		Runnable r=() ->{
		 
		//write the code that os supposed to be inside run()x	
		
		};
		
		Comparator comp=new Comparator() {
			public int compare(Object o1,Object o2) {
				return 0;
				
			}
		};
	}
	/*
	 * //we have 2 threads each of them calling their task ie runnable and when they
	 * call birtdate() both these tasks internally create obj of sdf
	 * 
	 * lets have for() each thread has a diff userid but essentially calling the same methdo
	 * lets say we have 1000 users so, it is impracticall to use 1000 threads 
	 * whic will consume more memory and thats why we can use thread pool in java instead
	 * we'll create fixed thread that ll create 10 threads,we have for loop that run 1000times and we'll submit
	 * 1000tasks for each usedrid and thesse tasks will be run by thread pool using 10threads
	 * in this case we have a threadpool of 10 threads and 100tasks,so internally all these taks create 1000 date format
	 * objects whic is slightly inefficient becasue these date formats can be reused across akll these tasks
	 * 
	 * if u make it gloabal then it is not thread safe
	 * if u make it global and thread safe by adding locks itll affect the performance
	 * so, if we create one obj per task, it occu[ies memory-slow perfor
	 * 
	 */

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
