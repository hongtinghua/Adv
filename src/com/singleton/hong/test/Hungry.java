package com.singleton.hong.test;


/**
 * 加载类的时候就会加载，无法延迟
 * @author tinghua.hong
 *
 */

public class Hungry {
	
	private  static Hungry h = new Hungry();
	
	private Hungry() {
		
	}
	public static Hungry getInstance() {
		return h;
	}
	

}
