package com.ssi.task3.stringclass;

public class Question9 {

	public static void main(String[] args) {
		String demo="ramam";
		StringBuffer sb = new StringBuffer(demo);
		StringBuffer reverseSB = sb.reverse();
		String reversed = reverseSB.toString();
		if(demo.equals(reversed)){
			System.out.println("Given String \""+demo+"\" is a palindrome");
		}
		else
			System.out.println("Given String \""+demo+"\" is not a palindrome");

	}

}
