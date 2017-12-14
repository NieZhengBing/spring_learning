package cn.javass.spring.chapter3.helloworld;

import java.util.Arrays;

public class ArrayTestInject {
	
	private String[] array;
	
	private Integer[][] array2;

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public Integer[][] getArray2() {
		return array2;
	}

	public void setArray2(Integer[][] array2) {
		this.array2 = array2;
	}
	
	public void getValue() {
		for(String x: array){
			System.out.println(x);
		}
		for(Integer[] a: array2){
			System.out.println(Arrays.toString(a));
		}
	}

}
