package com.ssi.task3.stringclass;

public class Question7 {

	public static void main(String[] args) {
		String demo = "hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		int smallCase =0, capitalCase=0,alphabets=0,digit=0,symbols=0,space=0;
		char chrA='A',chrZ='Z',chrSmlA='a',chrSmlZ='z',chrSpace=' ',chrZero='0',chrNine='9';
		int ASCIIValA=(int)chrA, ASCIIValZ=(int)chrZ,ASCIISmlA=(int)chrSmlA;
		int ASCIISmlZ = (int)chrSmlZ,ASCIIValSpace=(int)chrSpace,ASCIIVal0=(int)chrZero,ASCIIVal9=(int)chrNine;
		int strLen = demo.length();
		for(int i =0;i<strLen;++i )
		{
			if(ASCIIValA <=(int)demo.charAt(i) && ASCIIValZ>=(int)demo.charAt(i))
				capitalCase+=1;
			else if (ASCIISmlA <=(int)demo.charAt(i) && ASCIISmlZ>=(int)demo.charAt(i))
			smallCase+=1;
			else if (ASCIIVal0 <=(int)demo.charAt(i) && ASCIIVal9>=(int)demo.charAt(i))
				digit+=1;
			else if(ASCIIValSpace==(int)demo.charAt(i))
				space+=1;
			else
				symbols+=1;
		}
		alphabets=smallCase+capitalCase;
		System.out.println("String Length:"+strLen);
		System.out.println("No of Alphabets: "+alphabets);
		System.out.println("No of small letters: "+smallCase);
		System.out.println("No of capital letters: "+capitalCase);
		System.out.println("No of digits: "+digit);
		System.out.println("No of white space: "+space);
		System.out.println("No of Symbols "+symbols);
	}

}
