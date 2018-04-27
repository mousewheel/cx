package org.cx.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.cx.dao.ICustomerDAO;
import org.cx.dao.model.Customer;
import org.cx.domain.CustomerDto;
import org.cx.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService{
	
	@Resource(name="Customer")
	private	ICustomerDAO<Customer> customerDAO; 
	
	@Override
	public List<CustomerDto> queryByMap(Map<String, Object> map) {
		List<Customer> customers = customerDAO.queryByMap(map, "");
		List<CustomerDto> result = new ArrayList<CustomerDto>();
		for(Customer c:customers){
			CustomerDto dto= new CustomerDto();
			BeanUtils.copyProperties(c, dto);
			result.add(dto);
		}
		
		return result;
	}
}
