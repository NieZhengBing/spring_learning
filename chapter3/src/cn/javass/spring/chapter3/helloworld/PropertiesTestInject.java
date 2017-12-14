package cn.javass.spring.chapter3.helloworld;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertiesTestInject {

	public Properties values;

	public Properties getValues() {
		return values;
	}

	public void setValues(Properties values) {
		this.values = values;
	}

	public void getValue() {
		Iterator<?> iterator = values.entrySet().iterator();
		while (iterator.hasNext()) {
			@SuppressWarnings({ "unchecked" })
			Map.Entry<String, String> entry = (Entry<String, String>) iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
