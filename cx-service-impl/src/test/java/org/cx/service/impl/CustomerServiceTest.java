//package org.cx.service.impl;
//
//
//import java.util.List;
//
//import org.cx.domain.CustomerDto;
//import org.cx.service.ICustomerService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//// 告诉junit spring配置文件
//@ContextConfiguration({ "classpath*:/META-INF/config/spring-service.xml"})
//public class CustomerServiceTest {
//
//    @Autowired
//    public ICustomerService customerService;
//    
//    @Test
//    public void getUserByIdTest(){
//     
//        List<CustomerDto> customers = customerService.queryByMap(null);
//        System.out.println(customers.size());
//    }
//    
//}