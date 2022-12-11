package com.logical;

public class HighestNum {
	public static void main(String[] args) {
		int a[]= {10,50,80,90,20,100};
//		int max=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		System.out.println("max is: "+max);
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("min is: "+min);
	}

}
