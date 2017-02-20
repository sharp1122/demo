package com.sharp.demo.test;

public class WaitNotify {

	static Object obj = new Object();
	
	static int sum = 0;
	public static void main(String[] args) {

		MyThread thread1 = new MyThread();
		Thread t = new Thread(thread1);
		t.start();
		
		try {
			System.out.println("sleeping start...");
			Thread.sleep(5000);
			System.out.println("sleeping end...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyThread2 thread2 = new MyThread2();
		Thread tt = new Thread(thread2);
		tt.start();
	}
	
	public static void calc() {
		System.out.println("calc...");
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
	}
	
	public static void print() {
		System.out.println("print..." + sum);
	}
	
	static class MyThread implements Runnable {
		
		@Override
		public void run() {
				
			synchronized(obj) {
				System.out.println("threading: print start...");
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				print();
				System.out.println("threading: print end...");
			}
		}
		
	}
	
	static class MyThread2 implements Runnable {
		
		@Override
		public void run() {
				
			synchronized(obj) {
				System.out.println("threading: calc start...");
				calc();
				obj.notifyAll();
				System.out.println("threading: calc end...");
			}
		}
	}
}

