package com.yhj.bean.attribute.lookup;

public class Student extends Person {
	@Override
	public void talk() {
		System.out.println("I am a student");
	}

	@Override
	public Person getBean() {
		return null;
	}
}
