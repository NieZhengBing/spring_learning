package cn.javass.spring.chapter2.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloImpl2Test {
	// @Test
	// public void testInstantiatingBeanByConstructor() {
	// BeanFactory beanFactory =
	// new ClassPathXmlApplicationContext("instantiatingBean.xml");
	// HelloApi bean1 = beanFactory.getBean("bean1", HelloApi.class);
	// bean1.sayHello();
	// HelloApi bean2 = beanFactory.getBean("bean2", HelloApi.class);
	// bean2.sayHello();
	// }

	// @Test
	// public void testStaticFactory() {
	// BeanFactory beanFactory =
	// new ClassPathXmlApplicationContext("instantiatingBean.xml");
	// HelloApi helloApi = beanFactory.getBean("bean3", HelloApi.class);
	// helloApi.sayHello();
	// }

	@Test
	public void testInstantiantingBeanByInstanceFactory() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("instantiatingBean.xml");
		HelloApi bean4 = beanFactory.getBean("bean4", HelloApi.class);
		bean4.sayHello();
	}
}
