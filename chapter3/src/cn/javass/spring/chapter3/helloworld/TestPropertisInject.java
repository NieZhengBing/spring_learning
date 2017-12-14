package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPropertisInject {
	
	@Test
	public void testPropertisInject() {
		BeanFactory beanFactory =
		new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		PropertiesTestInject propertiesTestInject = (PropertiesTestInject) beanFactory.getBean("propertiesBean");
		propertiesTestInject.getValue();
	}

}
