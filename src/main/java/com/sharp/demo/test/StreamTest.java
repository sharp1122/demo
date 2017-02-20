package com.sharp.demo.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> s = list.stream().filter(x -> !x.equals("a"));
		
		if (true) {
			s = s.filter(x -> !x.equals("b"));
		}
		
		list = s.collect(Collectors.toList());
		
		list.forEach(System.out::println);
	}
}
