package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyTest {

	@Test
	public void testNavigationBeanInject() {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		NavigationA navigationA = context.getBean("a", NavigationA.class);
		navigationA.getNavaigationB().getNavigationC().sayNavigation();
		navigationA.getNavaigationB().getList().get(0).sayNavigation();
		navigationA.getNavaigationB().getMap().get("key").sayNavigation();
		navigationA.getNavaigationB().getArray()[0].sayNavigation();
		((NavigationC) navigationA.getNavaigationB().getProperties().get("1")).sayNavigation();
	}

}
