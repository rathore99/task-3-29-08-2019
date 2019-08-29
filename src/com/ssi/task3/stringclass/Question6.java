package com.ssi.task3.stringclass;

public class Question6 {

	public static void main(String[] args) {
		String demo ="madam";
		int strLen = demo.length();
		int limit= demo.length()/2;
		boolean palindrome = true;  
		for(int i=0,j=strLen-1;i<limit;++i,--j){
			if(demo.charAt(i)!=demo.charAt(j))
				palindrome =false;
		}
		if(palindrome)
		System.out.println("String is a palindrome");
		else
			System.out.println("String is not a palindrome");
	}

}
