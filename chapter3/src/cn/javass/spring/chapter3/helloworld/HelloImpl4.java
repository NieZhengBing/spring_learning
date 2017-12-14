package cn.javass.spring.chapter3.helloworld;

public class HelloImpl4 implements HelloApi {

	private String message;
	private Integer index;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	@Override
	public void sayHello() {
		System.out.println(index + ":" + message);

	}

}
