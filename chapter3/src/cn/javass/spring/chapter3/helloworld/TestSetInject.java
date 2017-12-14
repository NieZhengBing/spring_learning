package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetInject {
	
	@Test
	public void setTestInject() {
		BeanFactory beanFactory =
		new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		SetTestInject setTestInject = (SetTestInject) beanFactory.getBean("setBean");
		setTestInject.getValue();
	}

}
