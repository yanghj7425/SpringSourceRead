package com.yhj.mybatis.dao;

import com.yhj.mybatis.entity.Student;

import java.util.List;

public interface StudentMapper {
	List<Student> queryAllStudent();

	int insertStudent(Student student);
}
