package cn.javass.spring.chapter2.helloworld;

public class HelloApiStaticFactory {

	public static HelloApi getInstance(String message) {
		return new HelloImpl2(message);
	}

}
