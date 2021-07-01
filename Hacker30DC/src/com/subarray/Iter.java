package com.subarray;



import java.util.ArrayList; 
import java.util.Iterator;
import java.util.List; 
public class Iter{ 
	public static void main(String... args){
		List<String> listOfBooks = new ArrayList<>(); 
		listOfBooks.add("Programming Pearls"); 
		listOfBooks.add("Clean Code");
		listOfBooks.add("Effective Java");
		listOfBooks.add("Code Complete");
		System.out.println("List before : " + listOfBooks); 
		Iterator<String> iterator = listOfBooks.iterator(); 
		while(iterator.hasNext()){ String book = iterator.next(); 
		System.out.println("Removing " + book); iterator.remove(); } 
		System.out.println("List after : " + listOfBooks); } }

