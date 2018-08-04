package com.yhj.mybatis.entity;

public class Student {
	private String studentName;
	private String studentNumber;

	public Student() {
	}

	public Student(String studentName, String studentNumber) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Student{");
		sb.append("studentName='").append(studentName).append('\'');
		sb.append(", studentNumber='").append(studentNumber).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
