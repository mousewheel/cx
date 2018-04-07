package org.cx.domain;

import java.io.Serializable;

public class CustomerDto implements Serializable {
	
	private String Name;
	private Integer Age;
	private String Address;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public Integer getAge() {
		return Age;
	}
	
	public void setAge(Integer age) {
		Age = age;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
}
