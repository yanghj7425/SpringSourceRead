package com.yhj.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AutoAspectJBook {


	@Pointcut("execution(* com.yhj.aop.proxy.jdk.*.*(..))")
	public void book() {

	}


	@Before("book()")
	public void beforeBook() {
		System.out.println("beforeBook");
	}


	@After("book()")
	public void afterBook() {
		System.out.println("afterBook");

	}
}
