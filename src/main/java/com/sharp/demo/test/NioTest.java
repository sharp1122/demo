package com.sharp.demo.test;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest {

	public static void main(String[] args) {
		try {
			RandomAccessFile file = new RandomAccessFile("F:/tools/新员工.txt", "rw");
			
			FileChannel inChannel = file.getChannel();
			
			ByteBuffer byteBuffer = ByteBuffer.allocate(48);
			
			int byteRead = inChannel.read(byteBuffer);
			
			while (byteRead != -1) {
				byteBuffer.flip();
				
				while (byteBuffer.hasRemaining()) {
					System.out.print(byteBuffer.get());
				}
				
				byteBuffer.clear();
				
				byteRead = inChannel.read(byteBuffer);
			}
			inChannel.close();
			file.close();

			String str = "abc";  
	        String str1 = "abc";  
	        String str2 = new String("abc"); 
	        System.out.println("\n=============");  
	        System.out.println(str == str1);  //true
	        System.out.println(str1 == "abc");   // true
	        System.out.println(str2 == "abc");   //false
	        System.out.println(str1 == str2);   // false
	        System.out.println(str1.equals(str2));  //true
	        System.out.println(str1 == str2.intern());  
	        System.out.println(str2 == str2.intern());  
	        System.out.println(str1.hashCode() == str2.hashCode());  //true
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("###########finally###########");
		}
	}
}
