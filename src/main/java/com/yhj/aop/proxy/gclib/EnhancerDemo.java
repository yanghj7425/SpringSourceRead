package com.yhj.aop.proxy.gclib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class EnhancerDemo {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(EnhancerDemo.class);
		enhancer.setCallback(new MethodInterceptorImpl());


		EnhancerDemo demo = (EnhancerDemo) enhancer.create();
		demo.test();
		System.out.println(demo);
	}

	public void test() {
		System.out.println("test\t "  + getClass());
	}


	private static class MethodInterceptorImpl implements MethodInterceptor {


		@Override
		public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {

			System.out.println("before " + method);
			Object result = proxy.invokeSuper(o, args);
			System.out.println("after " + method);
			return result;
		}
	}
}
