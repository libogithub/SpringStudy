package com.libo.spring.aop.springAop.annotationAop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAopMain {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("com/libo/spring/aop/springAop/applicationContext6.xml");
		//被代理对象
		UserService userService = beanFactory.getBean(UserService.class);
		userService.save("aaid");
		
		
	}

}
