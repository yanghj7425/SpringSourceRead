package com.yhj.hello;

import com.yhj.MyHello;
import com.yhj.bean.attribute.constructor.Computer;
import com.yhj.bean.attribute.lookup.Person;
import com.yhj.bean.attribute.replaced.ChangeMethod;
import com.yhj.beanFactory.SimplePostProcessor;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class MyHelloTest {


	@Test
	public void xmlBeanFactoryTest() {

		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("hello.xml"));
		MyHello bean = (MyHello) bf.getBean("myHello");
		bean.sayHello();

		bf.getBean("myHello", MyHello.class);
//		Object obj = bf.getBean("&carFactory");
//
//		System.out.println(obj.getClass() + "\t" + obj);
//		obj = bf.getBean("carFactory");
//		System.out.println(obj.getClass() + "\t" + obj);
//
//		Car car = (Car) bf.getBean("car");
//		System.out.println(car);


	}


	public void constructAttribute() {
		BeanFactory beanFactory = getBeanFactory();
		Computer computer = (Computer) beanFactory.getBean("computer");
		System.out.println(computer);

	}

	public void lookUpAttribute() {
		BeanFactory beanFactory = getBeanFactory();

		Person person = (Person) beanFactory.getBean("person");
		person.talk();
	}

	public void replaceMethod() {
		BeanFactory beanFactory = getBeanFactory();

		ChangeMethod changeMethod = (ChangeMethod) beanFactory.getBean("changeMethod");
		changeMethod.changeMe("hello");
	}


	public void applicationContextTest() {
		// AbstractApplicationContext.java  -> refresh()  // 516
		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		MyHello hello = context.getBean("myHello", MyHello.class);
		hello.sayHello();
	}


	public void simplePostProcessor() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanFactory.xml");
		SimplePostProcessor simplePostProcessor = (SimplePostProcessor) context.getBean("simplePostProcessor");
		System.out.println(simplePostProcessor);
	}

	public void collectionTest() {
		List<String> source = new ArrayList<>();
		source.add("a");
		source.add("b");


		List<String> candicates = new ArrayList<>();
		candicates.add("a");
		candicates.add("b");

		String ret = CollectionUtils.findFirstMatch(source, candicates);
		System.out.println(ret);
	}


	private BeanFactory getBeanFactory() {
		return new XmlBeanFactory(new ClassPathResource("hello.xml"));
	}
}
