package com.yhj.aop.proxy.jdk.impl;

import com.yhj.aop.proxy.jdk.UserService;

public class UserServiceI implements UserService {
	@Override
	public void add() {
		System.out.println("---------add-------------");
	}

	@Override
	public void delete() {
		System.out.println("***********delete************");
	}
}
