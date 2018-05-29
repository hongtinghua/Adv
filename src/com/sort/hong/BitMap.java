package com.sort.hong;

public class BitMap {

	
	public static void main(String[] args) {
		int [] before = {1,3,4,3,6,7,34,76,23,676,446,7,454,343,67,99,3,2,88,6567,90};
		bitSort(before);
	}
	static void bitSort(int[] a) {
		int min = a[0];
		int max = a[0];
		for(int b:a) {
			min = min>b?b:min;
			max = max<b?b:max;
			
		}
		int len = max-min +1;
		byte [] after = new byte[len];
		for(int b:a) {
			after[b-min] = (byte) (after[b-min]+1);
		}
		
		
		for(int i = 0; i< len ;i++) {
				while(after[i]>0) {
					System.out.print(i+min);
					System.out.print(",");
					after[i] = (byte) (after[i]-1);
				}
		}
		
		
		
		
		
		
	}
}
