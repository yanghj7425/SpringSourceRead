package com.yhj.entity;

import java.util.Date;

public class Student {

	/**
	 * 入学时间
	 */
	private Date enrollTime;

	public Date getEnrollTime() {
		return enrollTime;
	}

	public void setEnrollTime(Date enrollTime) {
		this.enrollTime = enrollTime;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Student{");
		sb.append("enrollTime=").append(enrollTime);
		sb.append('}');
		return sb.toString();
	}
}
