package com.sharp.demo.test;

import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;

import com.sharp.demo.utils.DESUtil;

public class QrCode {

	public static List<String> userIds = Arrays.asList("1247");
	
	public static String userType = "3";
	
	public static void main(String[] args) {
		
		for (String userId : userIds) {
			String token;
			try {
				token = DESUtil.encrypt(userId+"&"+userType);
				token = java.net.URLEncoder.encode(token,"UTF-8");
				String text ="/qr/scanning?tk="+token;
				System.out.println(text);
				
				String detoken = URLDecoder.decode(token, "UTF-8");
				detoken = DESUtil.decrypt(detoken);
				System.out.println(detoken);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
