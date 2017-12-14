package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BooleanTest {
	@Test
	public void testBoolean() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		BooleanTestBean bean2 = (BooleanTestBean) beanFactory.getBean("bean2");		
		bean2.getSuccessValue();
		
		BooleanTestBean bean3 = (BooleanTestBean) beanFactory.getBean("bean3");
		bean3.getSuccessValue();

        BooleanTestBean bean4 = (BooleanTestBean) beanFactory.getBean("bean4");
        bean4.getSuccessValue();
	}

}
