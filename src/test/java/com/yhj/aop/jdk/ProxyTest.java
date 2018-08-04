package com.yhj.aop.jdk;

import com.yhj.aop.proxy.jdk.CustomInvocationHandler;
import com.yhj.aop.proxy.jdk.UserService;
import com.yhj.aop.proxy.jdk.impl.UserServiceI;
import org.junit.Test;

public class ProxyTest {

	@Test
	public void testProxy() {
		UserService userService = new UserServiceI();

		CustomInvocationHandler customInvocationHandler = new CustomInvocationHandler(userService);

		UserService proxy = (UserService) customInvocationHandler.getProxy();

		proxy.add();


		proxy.delete();

	}
}
