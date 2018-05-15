package com.singleton.hong.test;

/**
 * “双重检查锁,提高并发度
 * @author tinghua.hong
 *
 */
public class MutiThreadLazy2 {
	
private static MutiThreadLazy2  m = null;
	
	private MutiThreadLazy2() {
		
	}
	
	public   static MutiThreadLazy2 instance() {
		if(m==null) {
			synchronized (MutiThreadLazy2.class) {
				if(m==null) {
					m = new MutiThreadLazy2();
				}
			}
		}
		return m;
	}

}
