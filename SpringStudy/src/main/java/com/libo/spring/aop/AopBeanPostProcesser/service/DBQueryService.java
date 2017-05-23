package com.libo.spring.aop.AopBeanPostProcesser.service;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.libo.spring.aop.AopBeanPostProcesser.dao.IOrgQuery;
import com.libo.spring.aop.AopBeanPostProcesser.dao.IUserQuery;
import com.libo.spring.aop.AopBeanPostProcesser.dao.OrgQuery;


/**
 * jdk动态代理的缺点: 被代理对象必须实现接口。
 */
public class DBQueryService {

	private IOrgQuery orgQuery;
	
	private IUserQuery userQuery;
	
	public void serviceQuery(){
		userQuery.query("111111");
		orgQuery.query("22222");
	}

	public void setOrgQuery(IOrgQuery orgQuery) {
		this.orgQuery = orgQuery;
	}

	public void setUserQuery(IUserQuery userQuery) {
		this.userQuery = userQuery;
	}
	
	public static void main(String[] args) {
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("com/libo/spring/aop/applicationContext.xml");
		OrgQuery iOrgQuery = (OrgQuery)context.getBean("orgQuery");
		iOrgQuery.query("--------");
	}
}
