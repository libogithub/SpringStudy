package com.libo.spring.aop.cglib.service;

import com.libo.spring.aop.cglib.dao.DBQueryProxy;
import com.libo.spring.aop.cglib.dao.OrgQuery;
import com.libo.spring.aop.cglib.dao.UserQuery;

import net.sf.cglib.proxy.Enhancer;

/**
 * jdk动态代理的缺点: 被代理对象必须实现接口。
 */
public class DBQueryService {

	public static void main(String[] args) {
		UserQuery userQuery = createPoxy(new UserQuery());
		userQuery.query("111111");
		
		OrgQuery orgQuery = createPoxy(new OrgQuery());
		orgQuery.query("22222");
		
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T createPoxy(Object obj){
		Enhancer enhancer =new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(new DBQueryProxy(obj));
		return (T)enhancer.create();
	}
}
