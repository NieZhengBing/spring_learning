package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionBean {
	
	@Test
	public void testCollectionBean() {
		BeanFactory beanFactory =
		new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		CollectionTestBean collectionTestBean = (CollectionTestBean) beanFactory.getBean("collectionBean");
		collectionTestBean.getValue();
	}

}
