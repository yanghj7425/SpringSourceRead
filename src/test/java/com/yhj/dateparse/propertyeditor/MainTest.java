package com.yhj.dateparse.propertyeditor;

import com.yhj.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	@Test
	public void DIDateType() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-propertyEditor.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
	}

}
