package com.yhj.bean.attribute.lookup;

public abstract class Person {

	public void talk() {
		getBean().talk();
	}

	public abstract Person getBean();
}
