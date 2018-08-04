package com.yhj.mybatis.service;

import com.yhj.mybatis.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
	List<Student> queryAllStudent();

}
