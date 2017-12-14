package cn.javass.spring.chapter2.helloworld;

public class HelloImpl2 implements HelloApi {

	private String message;

	public HelloImpl2(String message) {
		super();
		this.message = message;
	}

	public HelloImpl2() {
		super();
		this.message = "Hello World";
	}

	@Override
	public void sayHello() {
		System.out.println(message);
	}

}
