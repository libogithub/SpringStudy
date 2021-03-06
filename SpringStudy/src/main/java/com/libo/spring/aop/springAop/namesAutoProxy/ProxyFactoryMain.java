package com.libo.spring.aop.springAop.namesAutoProxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.libo.spring.aop.springAop.service.IDBQueryService;


public class ProxyFactoryMain {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("com/libo/spring/aop/springAop/applicationContext3.xml");
		//被代理对象
		IDBQueryService dbQueryService = (IDBQueryService)beanFactory.getBean("dbQueryService");
		System.out.println(dbQueryService.getClass());
		dbQueryService.serviceOrgQuery();
		dbQueryService.serviceUserQuery();
		
		
	}

}
