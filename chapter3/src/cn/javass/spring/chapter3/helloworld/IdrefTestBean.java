package cn.javass.spring.chapter3.helloworld;

public class IdrefTestBean {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void getIdValue(){
		System.out.println(getId());
	}

}
