package com.logical;

import java.util.Scanner;

public class PalindromeNumber {
//	public static void check(int num) {
//		int rem=0;
//		int rev=0;
//		int temp=num;
//		while(num>0) {
//			rem=num%10;
//			rev=rev+10+rem;
//			num=num/10;
//		}
//		if(temp==rev) {
//			System.out.println("plaindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
//	}
//	public static void main(String[] args) {
//		check(1221);
//	}
		public static void main(String[] args) {
			 Scanner scanner=new Scanner(System.in);
			 System.out.println("Enter the number");
			 int num=scanner.nextInt();  //121
			 int org_num=num;			//org_num=121 =12
			 int rev=0;					//rev=0
			 while(num!=0) {			//121!=0 ok
				 rev=rev*10+ num%10;	//rev=0*10+121%10=0+1
				 num=num/10;			//num=121/10=12._
			 }
			 if(org_num==rev) {			//12
				 System.out.println("number is palindrome");
			 }
			 else {
				 System.out.println("number is not a palindrome");
			 }
		}
}
