package com.yhj.aop.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CustomInvocationHandler implements InvocationHandler {

	private Object target;


	public CustomInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("---------------Before-------------------");

		Object result = method.invoke(target, args);

		System.out.println("---------------After--------------------");
		return result;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
	}
}
