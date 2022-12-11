package com.logical;

public class DuplicatesInString {
	public static void main(String[] args) {
		int count=0;
		String s="i love java";
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<=s.length();j++) {
				if(i==j) {
					System.out.println("no");
					
				}
//				else if(count>1) {
//					System.out.println("duplicate is:"+i);
//				}
			}
			
		}
	}

}
