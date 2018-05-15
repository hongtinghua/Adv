package com.singleton.hong.test;

/**
 * 无法多线程
 * @author tinghua.hong
 *
 */
public class Rich {
	
	private static Rich r = null;
	
	private Rich () {
		
	}
	
	public static Rich instance() {
		if(r == null) {
			r = new Rich();
		}
		
		return r;
	}

}
