package com.libo.spring.aop.springAop.autoproxy;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SecutityAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("===================安全校验===================");
	}

}
