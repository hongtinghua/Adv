package com.proxy.hongth;

public class StudyProxy implements IStudent {

	private Student student;
	
	public StudyProxy(Student student){
		this.student = student;
	}
	
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("hahahahahah");
		student.study();
	}

}
