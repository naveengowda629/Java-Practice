package com.logical;

public class DuolicateRemove {
	public static void main(String[] args) {
		int index=0;
		int count;
		int[]a= {1,22,5,8,8,9,10};
		int size=a.length;
		int[]b=new int[size];
		for(int i=0;i<size-1;i++) {
			count=0;
		for(int j=i+1;i<size;j++) {
			if(a[i]==a[j]) {
				count=count+1;
				break;
			}
		}
			if(count==0) {
				b[index]=a[i];
				index++;
				}
			}	
		for(int k=0;k<b.length;k++) {
				if(b[k]!=0) {
					System.out.println(b[k]);
		
					}
			}
		}
}

	

		
	      
		

