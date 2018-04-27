package org.cx.service;


import java.util.List;
import java.util.Map;

import org.cx.domain.CustomerDto;

public interface ICustomerService {
	
	List<CustomerDto> queryByMap(Map<String, Object> map);
}
