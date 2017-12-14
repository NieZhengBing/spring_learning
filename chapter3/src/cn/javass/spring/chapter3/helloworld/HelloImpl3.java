package cn.javass.spring.chapter3.helloworld;

public class HelloImpl3 implements HelloApi {
	private String message;
	private Integer index;

	public HelloImpl3() {
		super();
	}

	// @java.bean.ConstructorProperties({"message", "index"})
	public HelloImpl3(String message, Integer index) {
		super();
		this.message = message;
		this.index = index;
	}

	@Override
	public void sayHello() {
		System.out.println(index + " " + message);

	}

}
