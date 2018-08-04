package com.yhj.bean.attribute.replaced;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class Replacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		for (Object o : args) {
			System.out.println(o.toString());
		}
		System.out.println(getClass().getName() + "： \t :" + obj.getClass().getName() + "\t : " + method.getName() + "\t ");
		return null;
	}
}
