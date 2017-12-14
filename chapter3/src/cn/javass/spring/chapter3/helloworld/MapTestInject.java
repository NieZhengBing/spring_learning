package cn.javass.spring.chapter3.helloworld;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTestInject {

	private Map<Integer, String> values;

	public Map<Integer, String> getValues() {
		return values;
	}

	public void setValues(Map<Integer, String> values) {
		this.values = values;
	}
	
	public void getValue() {
		Iterator<Entry<Integer, String>> iterator = values.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
