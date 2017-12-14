package cn.javass.spring.chapter3.helloworld;

import java.util.Collection;

public class CollectionTestBean {
	private Collection<String> values;

	public Collection<String> getValues() {
		return values;
	}

	public void setValues(Collection<String> values) {
		this.values = values;
	}
	
	public void getValue() {
		for(String value: values) {
			System.out.println(value);
		}
	}

}
