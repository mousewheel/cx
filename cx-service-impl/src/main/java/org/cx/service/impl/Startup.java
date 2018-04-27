package org.cx.service.impl;

import org.cx.common.log.Logger;
import org.cx.common.log.LoggerFactory;
import org.cx.common.service.ServiceContainer;

public class Startup {

	static Logger logger = LoggerFactory.getLogger(Startup.class);

	public static void main(String[] args) {
		ServiceContainer container = new ServiceContainer("service",
				"classpath*:/META-INF/config/spring-service.xml");
		container.start();
		
		logger.info("service started");
	}
}
