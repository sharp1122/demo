package com.sharp.demo.test;

public class TestSyString {
	public void test(String str) throws InterruptedException {
		synchronized (str.intern()) {
			Thread.sleep(5000);
			System.out.println(str);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		final TestSyString ts = new TestSyString();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					String str = new String("name");
					ts.test(str);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					String str = new String("name");
					ts.test(str);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread1.start();
		thread2.start();
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
//					Thread.sleep(1000);
//					String str = "name3";
//					synchronized (str) {
//						System.out.println(str);
//					}
					String str = new String("name");
					ts.test(str);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread3.start();
//		Thread.sleep(6000);
//		String str = "name";
//		System.out.println(str);
//		try {
//			System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
