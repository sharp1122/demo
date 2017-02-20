package com.sharp.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharp.demo.common.JSONMessage;
import com.sharp.demo.entity.UserInfo;

@RestController
@RequestMapping("/")
public class DemoController {

	@RequestMapping("/getinfo")
	public Object getInfo() {
		UserInfo info = new UserInfo();
		info.setUsername("sdf");
		info.setPassword("123");
		return info;
	}
	
	
	@RequestMapping("/login")
	public JSONMessage login(String username, String password) {
		UserInfo info = new UserInfo();
		info.setUsername(username);
		info.setPassword(password);
		return JSONMessage.success(info);
	}
}
