package com.yhj.hello.mybatis;

import com.yhj.mybatis.dao.StudentMapper;
import com.yhj.mybatis.entity.Student;
import com.yhj.mybatis.service.StudentService;
import com.yhj.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MybatisTest {


	public void queryStudentTest() {
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();

		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);


			Student student = new Student(String.valueOf(System.currentTimeMillis() % 100), "number" + System.currentTimeMillis() % 300);
			studentMapper.insertStudent(student);
			sqlSession.commit();

			List<Student> students = studentMapper.queryAllStudent();
			System.out.println(students);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}


	@Test
	public void mybatisSpringTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		StudentService studentService = context.getBean("studentService", StudentService.class);
		List<Student> students = studentService.queryAllStudent();

		System.out.println(students);


	}
}
