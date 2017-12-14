package cn.javass.spring.chapter2.helloworld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	@Test
	public void testHelloWorld() {
		// 读取配置文件并实例化一个IOC容器
		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
		// 从容器中获取Bean,注意此处完全"面向接口编程,而不是面向实现"
		HelloApi helloApi = context.getBean("hello", HelloApi.class);
		helloApi.sayHello();
	}

}
