package com.libo.spring.aop.springAop.ProxyFactory;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.libo.spring.aop.springAop.service.DBQueryService;
import com.libo.spring.aop.springAop.service.IDBQueryService;

public class ProxyFactoryMain {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("com/libo/spring/aop/springAop/applicationContext.xml");
		//被代理对象
		DBQueryService dbQueryService = (DBQueryService)beanFactory.getBean("dbQueryService");
		//Spring的代理工厂
		ProxyFactory proxyFactory = new ProxyFactory(dbQueryService);
		
		/*
		 * 添加Advice,Spring默认会添加DefaultPointcutAdvisor
		 * Advisor对象里面其实就是Adivce和PointCut
		 * Adivce定义了 “何时”,“做什么事情”
		 * PointCut定义了“何处”
		 */
		proxyFactory.addAdvice(new SecurityInterceptor());
		
		proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new LogInterceptor()));
		
		//如果被代理对象没有实现接口,那么Spring就会使用Cglib来生成代理对象
		//DBQueryService dbQueryServiceProxy = (DBQueryService)proxyFactory.getProxy();
		
		//如果被代理对象实现了接口那么Spring就会使用jdk的代理方式生成代理对象
		IDBQueryService dbQueryServiceProxy = (IDBQueryService)proxyFactory.getProxy();
		
		System.out.println(dbQueryServiceProxy.getClass());
		dbQueryServiceProxy.serviceOrgQuery();
		dbQueryServiceProxy.serviceUserQuery();
	}

}
