package com.yhj.aop;

public class BookBean {

	private String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String description() {
		System.out.println(getBookName());
		return getBookName();

	}
}
