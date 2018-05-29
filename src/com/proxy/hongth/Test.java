package com.proxy.hongth;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStudent st = (IStudent) new DynStudentProxy().bind(new Student());
		st.play();
		st.study();
	}

}
