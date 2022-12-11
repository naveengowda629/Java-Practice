package com.logical;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void main(String[] args) {
//		int a[]= {10,30,40,80,90,5};
//		System.out.println("before sort "+Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("after sort "+Arrays.toString(a));
//		System.out.println("=========");
//		Integer b[]= {10,30,40,80,90,5};
//		System.out.println("before sort "+Arrays.toString(b));
//		Arrays.sort(b,Collections.reverseOrder());
//		System.out.println("after sort "+Arrays.toString(b));
		int a[]= {44,88,22,77,99};
		int temp;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int b:a) {
			System.out.println(b);
		}
	}
	

}
