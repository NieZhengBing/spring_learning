package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTestInject {
	
	@Test
	public void testBeanInject() {
		BeanFactory beanFactory =
		new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		HelloApi beanInject1 = beanFactory.getBean("beanInject1", HelloApi.class);
		beanInject1.sayHello();

        HelloApi beanInject2 = beanFactory.getBean("beanInject2", HelloApi.class);
        beanInject2.sayHello();		
		
	}

}
