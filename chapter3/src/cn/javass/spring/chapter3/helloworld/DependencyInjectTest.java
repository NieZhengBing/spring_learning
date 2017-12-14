package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectTest {
	/*@Test
	public void testConstructorDepencynjectTest() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
		byIndex.sayHello();

        HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
        byType.sayHello();

        HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
        byName.sayHello();
	}*/
	
	@Test
	public void testSetterDependencyInject() {
		BeanFactory beanFactory =
				new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		HelloApi bean = (HelloApi) beanFactory.getBean("bean");
		bean.sayHello();
		
	}

}
