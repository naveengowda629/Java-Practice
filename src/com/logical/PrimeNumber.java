package com.logical;

import java.util.Scanner;

public class PrimeNumber {
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number");
//		int num=scanner.nextInt();
//		if(num%2==0) {
//			System.out.println("it is a prime number");
//		}
//		else {
//			System.out.println("not a prime number");
//		}
//	}
	public static void check(int n) {
		int count=0;
		if(n<1) {
			System.out.println("it is a prime number");
		}
		for(int i=1;i<=n/2;i++) {   		//10/2=5>1 5>6
			if(n%i==0) {					//
				count++;
			}
		}
		if(count>1) {
			System.out.println("it is not a prime number");
		}
		else {
			System.out.println("it is a prime number");
		}
	}
	public static void main(String[] args) {
		check(5);
	}

}
