package com.sharp.demo.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		User user = new User();
		user.setId("33");
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		user.setId("55");
		user.setName("lily");
		for (User u : userList) {
			System.out.println(u.getId() +"," + u.getName());
		}
	}
}


class User {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}