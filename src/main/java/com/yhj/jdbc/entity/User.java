package com.yhj.jdbc.entity;

public class User {
	private String employeeid;
	private String username;


	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User(String employeeid, String username) {
		this.employeeid = employeeid;
		this.username = username;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("User{");
		sb.append("employeeid='").append(employeeid).append('\'');
		sb.append(", username='").append(username).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
