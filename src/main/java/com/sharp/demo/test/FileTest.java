package com.sharp.demo.test;

import com.sharp.demo.utils.FileUtil;

public class FileTest {

	public static void main(String[] args) {
		String file = FileUtil.readFile("/com/sharp/demo/test/document/menu.json");
		
		System.out.println(file);
	}
}
