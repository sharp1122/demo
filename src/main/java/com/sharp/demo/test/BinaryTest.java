package com.sharp.demo.test;

import java.io.UnsupportedEncodingException;

public class BinaryTest {
	public static void main(String[] args) {
		int number = 10;
		// 原始数二进制
		printInfo(number);
		number = number << 1;
		// 左移一位
		printInfo(number);
		number = number >> 1;
		// 右移一位
		printInfo(number);
		
		System.out.println("============");
		
		int negativeNum = -10;
		negativeNum = negativeNum >> 1;
		System.out.println(negativeNum);
		printInfo(negativeNum);
		
		int negativeNum2 = -10;
		negativeNum2 = negativeNum2 >>> 1;
		System.out.println(negativeNum);
		printInfo(negativeNum);
		
		System.out.println("============");
		
		printInfo(8);
		printInfo(9);
		System.out.println("--------");
		int i = 8 ^ 9;//相同结果为0,不同结果为1
		printInfo(i);
		
		String str = "abc";
		try {
			byte[] bytes = str.getBytes("utf-8");
			System.out.println(bytes);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 输出一个int的二进制数
	 * 
	 * @param num
	 */
	private static void printInfo(int num) {
		System.out.println(Integer.toBinaryString(num));
	}
}
