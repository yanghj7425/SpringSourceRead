package com.yhj.user;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSimpleBeanDefinitionParser {

	protected Class getBeanClass(Element element) {
		return User.class;
	}


	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");
		if (StringUtils.hasText(userName)) {
			bean.addPropertyValue("userName", userName);
		}
		if (StringUtils.hasText(email)) {
			bean.addPropertyValue("email", email);
		}
	}
}
