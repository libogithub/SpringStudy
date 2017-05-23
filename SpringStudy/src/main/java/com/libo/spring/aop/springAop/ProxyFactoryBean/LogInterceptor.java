package com.libo.spring.aop.springAop.ProxyFactoryBean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 模拟安全的通知类
 *
 */
public class LogInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("===================开始日志===================");
		return invocation.proceed();
	}


}
