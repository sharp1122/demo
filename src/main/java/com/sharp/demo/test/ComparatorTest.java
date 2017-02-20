package com.sharp.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		Person p6 = new Person();
		p6.setAge(0);
		
		Person p1 = new Person();
		p1.setAge(22);
		
		Person p2 = new Person();
		p2.setAge(33);
		
		Person p3 = new Person();
		p3.setAge(12);
		
		Person p5 = new Person();
		p5.setAge(0);
		
		Person p4 = new Person();
		p4.setAge(24);
		
		List<Person> list = new ArrayList<>();
		list.add(p6);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p5);
		list.add(p4);
		Collections.sort(list, (Person x, Person y) -> {
			int xsize = x.getAge();
			int ysize = y.getAge();
			if (xsize == 0 && ysize > 0) {
				return 1;
			} else if (xsize > 0 && ysize == 0) {
				return -1;
			}
			return 0;
		});
		
		list.forEach(x -> {
			System.out.println(x.getAge());
		});
	}
	
}

class Person {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
