package com.yhj.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TT {


	@Pointcut("execution(* com.yhj.aop.auto.*.*(..))")
	public void book() {
	}


	@Before("book()")
	public void beforeBook() {
		System.out.println("before TT");
	}


	@After("book()")
	public void afterBook() {
		System.out.println("after TT");

	}
}
