package org.cx.dao.model;

import org.cx.common.dao.IModel;

public class Customer implements IModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
