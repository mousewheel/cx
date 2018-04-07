package org.cx.service.impl;

import org.cx.domain.CustomerDto;
import org.cx.service.ICustomerService;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerService implements ICustomerService{

	@Override
	public void sayHello(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		System.out.println(customerDto.getName() +"says Hello!");
	}

	@Override
	public String selfIntroduce(CustomerDto customerDto) {
		return String.format("My name is %s, %s yers old", customerDto.getName(), customerDto.getAge());
	}
}
