package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
 * Java 8 streams API by Defog Tech
 */
public class StreamExamples {

	public static void main(String[] args) {
		int numbers[]= {4,1,13,90,16,2,20,1};
		int min = IntStream.of(numbers).min().getAsInt();
		System.out.println(min);
		IntStream.of();
		IntStream stream = IntStream.of(-9, -18, 54, 8, 7, 14, 3);
		OptionalInt min3 = stream.min();
		if(min3.isPresent())
			System.out.println(min3);
		//   OR
		
		Stream<String> sorted = Arrays.stream(new String[] {"Ram","Rahim","Robert"}).filter(s->s.startsWith("Ro")).
		map(String::toLowerCase).sorted();
		sorted.collect(Collectors.toList());
		IntStream.of(numbers).min().ifPresent(System.out::println);
		long count = IntStream.of(numbers).count();
		System.out.println("Count: "+count);
		IntStream.of(numbers).max().ifPresent(System.out::println);
		IntStream.of(numbers).average().ifPresent(System.out::println);
		int sum = IntStream.of(numbers).sum();
		
		//Statistics
		IntSummaryStatistics summaryStatistics = IntStream.of(numbers).summaryStatistics();
		double average = summaryStatistics.getAverage();
		summaryStatistics.getCount();
		int max = summaryStatistics.getMax();
		int min2 = summaryStatistics.getMin();
		long sum2 = summaryStatistics.getSum();
		
		
		//how to find 3 distince smallest numbers from an array
		int[] num= {4,1,13,90,16,2,0};
		System.out.println("first 3 max numbers are");
		IntStream.of(num).//create the stream
		sorted().distinct().limit(3).//process the stream
		forEach(System.out::println);//consume the stream
		
		
		//
		
		IntStream.of(numbers).sorted();
		IntStream.of(numbers).distinct();
		IntStream.of(numbers).min();
		IntStream.of(numbers).max();
		IntStream.of(numbers).count();
		IntStream.of(numbers).limit(3); //getfirst 3
		IntStream.of(numbers).skip(3);  //skip first 3
		IntStream.of(numbers).filter(n -> n % 2 == 0); //only even
		IntStream.of(numbers).map(n->n*2);   //double each number in arrays
		IntStream.of(numbers).boxed(); //convert each number to Integer
		//IntStream.range(startInclusive, endExclusive);
		//IntStream.rangeClosed(startInclusive, endInclusive);
		IntStream.range(1, 100).forEach(System.out::println);;//1 to 99
		int[] array = IntStream.range(1,100).toArray();
		List<Integer> collect = IntStream.range(1, 100).boxed().collect(Collectors.toList());
		boolean allMatch = IntStream.range(1, 100).allMatch(n->n%2==0);//any number even
		boolean anyMatch = IntStream.range(1,100).anyMatch(n->n%2==0); //all numbers even
	
		//list of top 3 highest earning employees--display names hence use map(Employee::getName)
		//List<Employee> emp=getAllEmployees();
		//List<Employee> copy=new ArrayLsit<>(emp);
	//	copy.sort((o1,o2)->o2.getSalary()-o1.getSalary());
		
		//for (int i = 0; i < 3; i++) {
		//	Employee emp=copy.get(i);
		//	System.out.println(emp.getNAme());
		//}
	//	above with streams
		List<Employee> employees=getAllEmployees();
		employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(3).map(Employee::getName).forEach(System.out::println);
		//map(Employee::getName)
		
		
	//if u want to have string separated by comma use joinign
		String names=employees.stream().limit(3).collect(Collectors.joining(","));
		
		
		//group by dept
		
		Map<String,List<Employee>> empByDept=employees.stream().collect(Collectors.groupingBy(e->e.dept));
		Map<String,Long> deptcoutn=employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		
		
	}
}
