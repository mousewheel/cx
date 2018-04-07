package org.cx.service.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup 
{
    public static void main( String[] args )
    {
    	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
           context.start();

           System.out.println("Dubbo provider start...");

           try {
               System.in.read();   // 按任意键退出
           } catch (IOException e) {
               e.printStackTrace();
           } 
    }
}
