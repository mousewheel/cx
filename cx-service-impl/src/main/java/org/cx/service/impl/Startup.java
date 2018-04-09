package org.cx.service.impl;

import java.io.IOException;
import java.util.List;

import org.cx.domain.CustomerDto;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Startup 
{
    public static void main( String[] args )
    {
    	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
           context.start();
           
           System.out.println("Dubbo provider start...");
           
          List<CustomerDto> customerDtos= new CustomerServiceImpl().queryByMap(null);
          System.out.println(customerDtos.size());
           try {
               System.in.read();   // 按任意键退出
           } catch (IOException e) {
               e.printStackTrace();
           } 
    }
}
