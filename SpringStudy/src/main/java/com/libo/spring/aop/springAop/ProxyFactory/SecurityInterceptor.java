package com.libo.spring.aop.springAop.ProxyFactory;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 模拟安全的通知类
 *
 */
public class SecurityInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("===================安全校验===================");
		return invocation.proceed();
	}


}
