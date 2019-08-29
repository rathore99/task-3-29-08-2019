package com.ssi.task3.stringclass;

public class Question8 {

	public static void main(String[] args) {
		String demo = "India,Australia,England,Canada";

		int strt = 0, end = 0;
		while (true) {
			end = demo.indexOf(',', strt);
			if (end == -1) {
				System.out.println(demo.substring(strt, demo.length()));
				break;
			}

			// System.out.println("end "+end);
			System.out.println(demo.substring(strt, end));

			strt = end + 1;

		}
	}
}