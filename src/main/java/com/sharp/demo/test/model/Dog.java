package com.sharp.demo.test.model;

public class Dog extends Animal {

	public Dog () {
		System.out.println(a);
		a = new A();
	}
	
	public void print() {
		super.print();
		System.out.println("dog: "+a);
	}
	
	public static void main(String[] args) {
		Animal an = new Dog();
		an.print();
		
		Animal an2 = new Cat();
		an2.print();
	}
}
