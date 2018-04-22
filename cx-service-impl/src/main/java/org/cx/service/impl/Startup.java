package org.cx.service.impl;

import java.io.IOException;
import java.util.List;

import org.cx.common.log.Logger;
import org.cx.common.log.LoggerFactory;
import org.cx.common.service.ServiceContainer;
import org.cx.domain.CustomerDto;
import org.cx.service.ICustomerService;

public class Startup {

	static Logger logger = LoggerFactory.getLogger(Startup.class);

	public static void main(String[] args) {
		ServiceContainer container = new ServiceContainer("order-service",
				"classpath*:/META-INF/config/spring-service.xml");
		container.start();
		logger.info("test");
		logger.error("error test");
		

		ICustomerService customerService = container.getBean(CustomerServiceImpl.class);
		List<CustomerDto> customerDtos = customerService.queryByMap(null);

		System.out.println(customerDtos.size());
		try {
			System.in.read(); // 按任意键退出
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
