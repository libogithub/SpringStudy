package com.libo.spring.aop.AopBeanPostProcesser.dao;

public class OrgQuery implements IOrgQuery{
	
	public void query(String id){
		System.out.println("查询组织机构。");
	}
}
