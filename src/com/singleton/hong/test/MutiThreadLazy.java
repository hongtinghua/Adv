package com.singleton.hong.test;

/**
 * 线程安全但是效率低
 * @author tinghua.hong
 *
 */
public class MutiThreadLazy {
	
	private static MutiThreadLazy  m = null;
	
	private MutiThreadLazy() {
		
	}
	
	public synchronized  static MutiThreadLazy instance() {
		if(m==null) {
			m = new MutiThreadLazy();
		}
		return m;
	}

}
