package com.libo.spring.aop.springAop.dao;

public class OrgQuery implements IOrgQuery{
	
	public void query(String id){
		System.out.println("查询组织机构。");
	}
}
