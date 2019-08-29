package com.ssi.task3.stringclass;

public class Question5 {

	public static void main(String[] args) {
		int fromIndex = 0, val,counter=0;
		String demo = "this is java and java is object oriented and java is powerful. I love java language";
		String s = "java";
		while (true) {
			val = demo.indexOf(s, fromIndex);
			if (val != -1) {
				System.out.println(s);
				counter+=1;
			}
			else
				break;
			fromIndex = val+1;
			

		}
		System.out.println("Occurance of java in string is  "+counter);

	}

}
