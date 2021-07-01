package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class UsingStream/*<T extends Number>*/ {
	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(12,20,35,46,55,68,75);
		System.out.println("Nami"+values.stream().filter(i->i%5==0).reduce(0, (a,b)->a+b));
		//values.stream().filter(i->i%5==0).reduce(0, (a,b)->a+b).forEach(System.out::println);

String collect = Arrays.stream(new String[] { "Ram", "Robert", "Rahim", "Rohit","Rohini"
}).filter(s-> s.startsWith("Ro")) .map(String::toLowerCase).sorted().collect(Collectors.joining());
System.out.println("Nami"+collect);
	

List<Integer> values1=Arrays.asList(1,2,3,4,5,6);
System.out.println(values1.stream().map(i->i*2).reduce(0, (a,b)->a+b));
//map returns a value
//filter returns boolean
List<Integer> values11 = null;//convert list to array
//int[] array = values11.stream().mapToInt(i->i).toArray();

System.out.println("-------------------");
List<Integer> namith=Arrays.asList(1,2,3,4,5,6);
namith.stream().filter(s->s*s>1000).mapToInt(n->n.intValue()).average();

Arrays.stream(new String[] { "Ram", "Robert", "Rahim", "Rohit","Rohini"
}).filter(s->s.startsWith("Ro")).map(String::toLowerCase).sorted().forEach(System.out::println);
System.out.println("Nami"+collect);

System.out.println("---------------ellsfargo-----------");
double[] numbers= {4,1,13,90,16,2,20,1,-2,3.5};
double d=DoubleStream.of(numbers).min().getAsDouble();
System.out.println(d);

}
}