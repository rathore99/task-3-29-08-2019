package com.ssi.task3.stringclass;

public class Question10 {

	public static void main(String[] args) {
		String demo = "ad3daddfd5443dfsfss";
		char chrZero='0',chrNine='9';
		int ASCIIVal0 = (int)chrZero, ASCIIValNine= (int)chrNine;
		int i=0,strLen = demo.length();
		for( i=0;i<strLen;++i){
			if(ASCIIVal0<=demo.charAt(i) && ASCIIValNine>=demo.charAt(i) )
				continue;
			//else
			System.out.print(demo.charAt(i));
		}
			System.out.println();

	}

}
