package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMapInject {
	@Test
	public void getValue() {
		BeanFactory beanFactory =
		new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		MapTestInject mapTestInject = (MapTestInject) beanFactory.getBean("mapBean");
		mapTestInject.getValue();
	}

}
