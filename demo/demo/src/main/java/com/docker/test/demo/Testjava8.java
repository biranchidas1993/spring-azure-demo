package com.docker.test.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Testjava8 {
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(45,67,89,4,14,2);
		
		int num=numbers.stream().max(Comparator.naturalOrder()).get();
		System.out.println(num);
		numbers.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);;
		
		
	}

}
