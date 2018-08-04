package com.yhj;

import com.yhj.car.Car;
import org.springframework.beans.factory.annotation.Autowired;

public class MyHello {


	@Autowired
	private Car car;

	private String hStr;

	private String testStr;


	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public String gethStr() {
		return hStr;
	}

	public void sethStr(String hStr) {
		this.hStr = hStr;
	}

	public void sayHello() {
		System.out.println("hello word \t" + this);
	}


	public MyHello(String hStr) {
		this.hStr = hStr;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}



	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("MyHello{");
		sb.append("car=").append(car);
		sb.append(", hStr='").append(hStr).append('\'');
		sb.append(", testStr='").append(testStr).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
