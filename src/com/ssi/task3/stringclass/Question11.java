package com.ssi.task3.stringclass;
import java.util.StringTokenizer;;
public class Question11 {

	public static void main(String[] args) {
		String demo = "1.java,2.oracle,3.python,4.php,5.linux.....";
		StringTokenizer st = new StringTokenizer(demo,"123456789.,");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
