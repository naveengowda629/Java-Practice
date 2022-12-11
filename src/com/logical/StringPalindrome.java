package com.logical;

import java.util.Scanner;

public class StringPalindrome {
//	public static void check(String a) {
//		String b="";
//		for(int i=a.length()-1;i>=0;i--) {
//			b=b+a.charAt(i);
//			
//		}
//		if(a.equals(b)) {
//			System.out.println("is palindrome");
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
//	}
	public static void main(String[] args) {
//		check("malayalam");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
			
		}
		if(a.equals(b)) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

}
