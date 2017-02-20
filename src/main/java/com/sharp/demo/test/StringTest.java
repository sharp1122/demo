package com.sharp.demo.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

	public static void main(String[] args) {
		String message = "尊敬的{0}您好，{1}管理员{2}已经为您在药店圈上创建了{3}登录账号，默认密码为空。请您点击下载链接{5} ，安装APP后登录并设置新密码。";
		Pattern pattern = Pattern.compile("\\{\\d+\\}");
		Matcher matcher = pattern.matcher(message);
		System.out.println(matcher.groupCount());
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		System.out.println(count);
		
		
		String str = "1234567";
		System.out.println("======="+str.length());
		System.out.println("======="+str.substring(0, 7));		
	}
}
