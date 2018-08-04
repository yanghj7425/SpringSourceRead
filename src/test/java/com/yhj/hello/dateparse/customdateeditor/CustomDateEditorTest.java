package com.yhj.hello.dateparse.customdateeditor;

import com.yhj.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-customdateeditor.xml"})
public class CustomDateEditorTest {

	@Autowired
	private ApplicationContext context;

	@Test
	public void testDateFormat() {

		Student student = context.getBean(Student.class);
		System.out.println(student);
	}

}
