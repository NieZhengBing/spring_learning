package cn.javass.spring.chapter3.helloworld;

public class HelloApiDecorator implements HelloApi {
	private HelloApi helloApi;

	private HelloApi helloiApi;

	public HelloApiDecorator() {
		super();
	}

	public HelloApiDecorator(HelloApi helloApi) {
		super();
		this.helloApi = helloApi;
	}

	@Override
	public void sayHello() {
		System.out.println("========decorator begin=========");
		helloApi.sayHello();
		System.out.println("========decorator end===========");
	}

	public HelloApi getHelloApi() {
		return helloApi;
	}

	public void setHelloApi(HelloApi helloApi) {
		this.helloApi = helloApi;
	}

	public HelloApi getHelloiApi() {
		return helloiApi;
	}

	public void setHelloiApi(HelloApi helloiApi) {
		this.helloiApi = helloiApi;
	}

}
