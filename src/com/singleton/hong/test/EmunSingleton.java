package com.singleton.hong.test;


public enum EmunSingleton {
	
	INSTANCE;
	
	private Resource r;
	
	private EmunSingleton(){
		r = new Resource();
	}
	
	public Resource getinstance() {
		return r;
	}

}


class Resource{
	
	
}