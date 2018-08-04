package com.yhj.bean.attribute.constructor;

import java.beans.ConstructorProperties;

public class Computer {

	private int price;
	private String color;
	private int year;
	private int size;


	@ConstructorProperties({"price", "color"})
	public Computer(int price, String color) {
		this.price = price;
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Computer{" +
				"price=" + price +
				", color='" + color + '\'' +
				", year=" + year +
				", size=" + size +
				'}';
	}
}
