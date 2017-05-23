package com.libo.spring.aop.jdk.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DbQueryProxy implements InvocationHandler {
	
	//被代理对象
	private Object target ;
	
	public Object bind(Object target){
		this.target = target ;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("query id:"+args[0]);
		Object result = method.invoke(target, args);
		return result;
	}
}
