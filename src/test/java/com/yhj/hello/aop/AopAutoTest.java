package com.yhj.hello.aop;

import com.yhj.aop.BookBean;
import com.yhj.aop.auto.AutoBook;
import com.yhj.aop.proxy.jdk.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class AopAutoTest {

	@Test
	public void userServiceTest() {
		BeanFactory bf = new ClassPathXmlApplicationContext("spring-aop.xml");
		UserService userService = bf.getBean("userService",UserService.class);
		userService.delete();
	}


	public void aopAnnotationTest() {
		BeanFactory bf = new ClassPathXmlApplicationContext("spring-aop.xml");


		AutoBook autoBook = bf.getBean("autoBook", AutoBook.class);


		System.out.println("**********************************");
		autoBook.fuckAspect();

//		System.out.println("**********************************");
//		autoBook.test();

//		AutoCat autoCat = bf.getBean("autoCat", AutoCat.class);
//		autoCat.cat();

	}


	public void aopXmlConfigTest() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-aop.xml"));

		BookBean bookBean = bf.getBean("bookBean", BookBean.class);
		bookBean.description();
	}

}
