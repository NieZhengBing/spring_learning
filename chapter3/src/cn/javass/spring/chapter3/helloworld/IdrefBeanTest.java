package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdrefBeanTest {
	@Test
	public void testIdRef() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		IdrefTestBean idRefBean1 = (IdrefTestBean) beanFactory.getBean("idRefBean1");
		idRefBean1.getIdValue();
		IdrefTestBean idRefBean2 = (IdrefTestBean) beanFactory.getBean("idRefBean2");
		idRefBean2.getIdValue();
	}

}
