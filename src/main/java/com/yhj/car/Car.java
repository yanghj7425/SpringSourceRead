package com.yhj.car;

public class Car {

	private int maxSpeed;
	private String  brand;
	private double price;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Car{");
		sb.append("maxSpeed=").append(maxSpeed);
		sb.append(", brand='").append(brand).append('\'');
		sb.append(", price=").append(price);
		sb.append('}');
		return sb.toString();
	}
}
