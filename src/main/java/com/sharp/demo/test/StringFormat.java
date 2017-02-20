package com.sharp.demo.test;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringFormat {

	public static void main(String[] args) {
		
		String str = "你好！%s我要去%s，结果可能不%s";
		
		str = String.format(str, "明天","广州","理想");
		
		System.out.println(str);
		
		
		str = "你好！结果可能不{1}，{3}我要去{0}";
		
		str = MessageFormat.format(str, "广州","理想","明天");
		
		System.out.println(str);
		
		str = "http://120.24.94.126:80/health/web/appInvite/joinToGroup.html";
		
		str = str.replaceFirst("health/web", "health/web/bd_h5");
		
		System.out.println(str);
		
		long timestamp = 1474387200000L;
		
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(sdf.format(new Date(timestamp)));
	
	
		Double d = 2.0d;
		Double dd = Double.valueOf(d.intValue());
		System.out.println(dd);
		System.out.println(Double.parseDouble(d.intValue()+""));
	}
}
