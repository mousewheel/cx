package org.cx.common.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.spring.SpringContainer;

public class ServiceContainer {
	private SpringContainer container = null;
	public static String SERVICE_ID;
	static ClassPathXmlApplicationContext context;

	public ServiceContainer(String id, String location) {
		SERVICE_ID = id;
		String tmpLocation = (location == null ? "classpath*:META-INF/config/spring/spring-service.xml" : location);
		System.setProperty("dubbo.spring.config", tmpLocation);
		container = new SpringContainer();
	}
	
	public void start(){
		container.start();
		context = SpringContainer.getContext();
	}
	
	public static <T> T getBean(Class<T> requiredType) {
		T bean = null;
		try {
			bean = context.getBean(requiredType);
		} catch (Exception ex) {
		}
		return bean;
	}

}
