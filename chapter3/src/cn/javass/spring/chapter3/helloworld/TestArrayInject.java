package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestArrayInject {
	@Test
	public void testArrayInject() {
		BeanFactory beanFactory =
		new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		ArrayTestInject arrayTestInject = (ArrayTestInject) beanFactory.getBean("arrayBean");
		arrayTestInject.getValue();
	}

}
