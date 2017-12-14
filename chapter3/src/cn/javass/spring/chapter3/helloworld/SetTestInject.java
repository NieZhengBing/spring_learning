package cn.javass.spring.chapter3.helloworld;

import java.util.Set;

public class SetTestInject {
	
	private Set<Integer> values;

	public Set<Integer> getValues() {
		return values;
	}

	public void setValues(Set<Integer> values) {
		this.values = values;
	}
	
	public void getValue() {
		for(Integer value : values) {
			System.out.println(value);
		}
	}
	
	

}
