package com.libo.spring.aop.springAop.service;

import com.libo.spring.aop.springAop.dao.IOrgQuery;
import com.libo.spring.aop.springAop.dao.IUserQuery;

/**
 * jdk动态代理的缺点: 被代理对象必须实现接口。
 */
public class DBQueryService{

	private IOrgQuery orgQuery;
	
	private IUserQuery userQuery;
	
	public void serviceOrgQuery(){
		orgQuery.query("22222");
	}
	
	public void serviceUserQuery(){
		userQuery.query("111111");
	}

	public void setOrgQuery(IOrgQuery orgQuery) {
		this.orgQuery = orgQuery;
	}

	public void setUserQuery(IUserQuery userQuery) {
		this.userQuery = userQuery;
	}
	
}
