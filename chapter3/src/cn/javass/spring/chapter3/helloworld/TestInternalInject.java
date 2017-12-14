package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInternalInject {
	@Test
	public void internalTestInject() {
		ApplicationContext context =
		new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		HelloApiDecorator helloApiDecorator = context.getBean("internalTestBean", HelloApiDecorator.class);
		helloApiDecorator.sayHello();
	}

}
