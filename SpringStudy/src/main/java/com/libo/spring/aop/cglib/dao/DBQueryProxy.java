package com.libo.spring.aop.cglib.dao;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class DBQueryProxy implements MethodInterceptor {
	
	private Object target ;
	
	public DBQueryProxy(Object target) {
		this.target = target;
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("权限鉴别。。。");
		//Object result = proxy.invokeSuper(obj, args);
		Object result = proxy.invoke(target, args);
		System.out.println("关闭连接。。。");
		return result;
	}

}
