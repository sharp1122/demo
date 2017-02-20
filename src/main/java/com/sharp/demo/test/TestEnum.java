package com.sharp.demo.test;

import java.util.EnumSet;

public class TestEnum {

	enum Direction {
		east, west, south, north;
	}
	
	public Direction getDirection(EnumSet<Direction> set) {
		return Direction.east;
	}
	
	public static void main(String[] args) {
		
		Double d = 0.0d;
		System.out.println(d.doubleValue() == 0);
		
		String str = "这是一个悲伤的故事主人公跳下了悬崖侥幸不死练成了绝世神功！";
		System.out.println(str.length());
	}
}
