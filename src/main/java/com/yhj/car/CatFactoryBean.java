package com.yhj.car;

import com.yhj.MyHello;
import org.springframework.beans.factory.FactoryBean;

public class CatFactoryBean implements FactoryBean<Car> {

	private String carInfo;


	private MyHello myHello;

	@Override
	public Car getObject() {
		Car car = new Car();
		String[] cars = getCarInfo().split(",");
		car.setBrand(cars[0]);
		car.setMaxSpeed(Integer.valueOf(cars[1]));
		car.setPrice(Double.parseDouble(cars[2]));

		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	public MyHello getMyHello() {
		return myHello;
	}

	public void setMyHello(MyHello myHello) {
		this.myHello = myHello;
	}
}
