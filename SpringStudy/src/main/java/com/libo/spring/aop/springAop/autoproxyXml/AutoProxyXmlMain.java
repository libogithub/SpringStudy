package com.libo.spring.aop.springAop.autoproxyXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.libo.spring.aop.springAop.service.DBQueryService;


public class AutoProxyXmlMain {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("com/libo/spring/aop/springAop/applicationContext5.xml");
		//被代理对象
		DBQueryService dbQueryService = (DBQueryService)beanFactory.getBean("dbQueryService");
		System.out.println(dbQueryService.getClass());
		dbQueryService.serviceOrgQuery();
		dbQueryService.serviceUserQuery();
		
		
	}

}
