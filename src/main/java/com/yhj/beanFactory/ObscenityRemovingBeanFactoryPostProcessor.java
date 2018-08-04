package com.yhj.beanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.HashSet;
import java.util.Set;

public class ObscenityRemovingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	private Set<String> obscenities;


	public ObscenityRemovingBeanFactoryPostProcessor() {
		obscenities = new HashSet<>();
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanNames = beanFactory.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
			StringValueResolver valueResolver = s -> {
				if (isObscene(s)) {
					return "*****";
				}
				return s;
			};
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
			visitor.visitBeanDefinition(beanDefinition);
		}
	}

	private boolean isObscene(String s) {

		return this.obscenities.contains(s.toUpperCase());
	}

	public void setObscenities(Set<String> obscenities) {
		this.obscenities.clear();

		for (String obscenity : obscenities) {
			this.obscenities.add(obscenity.toUpperCase());
		}

	}
}
