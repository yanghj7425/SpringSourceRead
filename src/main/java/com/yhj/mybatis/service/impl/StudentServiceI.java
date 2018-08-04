package com.yhj.mybatis.service.impl;

import com.yhj.mybatis.dao.StudentMapper;
import com.yhj.mybatis.entity.Student;
import com.yhj.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "studentService")
public class StudentServiceI implements StudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> queryAllStudent() {
		return studentMapper.queryAllStudent();
	}
}
