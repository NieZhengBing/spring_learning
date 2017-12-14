package cn.javass.spring.chapter3.helloworld;

public class HelloApiImpl implements HelloApi {

	@Override
	public void sayHello() {
		System.out.println("say hello.");
	}

}
