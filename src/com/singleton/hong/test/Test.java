package com.singleton.hong.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new Resource();
		Resource r1 =EmunSingleton.INSTANCE.getinstance();
		Resource r2 =EmunSingleton.INSTANCE.getinstance();
		
		System.out.println(r==r1);
		System.out.println(r2==r1);
	}

}
