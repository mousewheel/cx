package org.cx.service;

import org.cx.domain.CustomerDto;

public interface ICustomerService {
	void sayHello(CustomerDto customerDto) ;
	
	String selfIntroduce(CustomerDto customerDto);
}
