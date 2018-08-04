package com.yhj.bean.attribute.lookup;

public class Teacher extends Person {


	@Override
	public void talk() {
		System.out.println("I am a teacher");
	}

	@Override
	public Person getBean() {
		return null;
	}
}
