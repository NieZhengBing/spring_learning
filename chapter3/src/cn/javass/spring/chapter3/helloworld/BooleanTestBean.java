package cn.javass.spring.chapter3.helloworld;

public class BooleanTestBean {

	private Boolean success;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public void getSuccessValue() {
		System.out.println(getSuccess());
	}

}
