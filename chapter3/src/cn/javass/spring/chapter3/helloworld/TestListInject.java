package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestListInject {
	@Test
	public void testListInject() {
		BeanFactory beanFactory =
				new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		ListTestBean listTestBean = (ListTestBean) beanFactory.getBean("listBean");		
		listTestBean.getValue();
	}

}
