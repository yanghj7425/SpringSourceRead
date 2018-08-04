package com.yhj.hello.jdbc;

import com.yhj.jdbc.entity.User;
import com.yhj.jdbc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcDemo {

	@Test
	public void jdbcTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-jdbc.xml");
		UserService userService = context.getBean("userService", UserService.class);
		System.out.println(userService);
		User user = new User("11", "" + (System.currentTimeMillis() % 1000));
		userService.save(user);
		List<User> list = userService.queryAllUser();
		for (User u : list) {
			System.out.println(u);
		}
	}
}
